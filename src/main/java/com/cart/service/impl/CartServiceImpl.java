package com.cart.service.impl;

import com.cart.dto.CartDTO;
import com.cart.dto.ProductCategoryDTO;
import com.cart.dto.ProductDTO;
import com.cart.model.Cart;
import com.cart.model.Product;
import com.cart.model.ProductCategory;
import com.cart.repository.CartRepository;
import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<CartDTO> getCartsByStatus(CartStatus status) {
        List<Cart> carts = cartRepository.getByStatus(status);
        List<CartDTO> cartDTOs = new ArrayList<>();
        carts.forEach(cart -> {
            CartDTO cartDTO = prepareCartDTO(cart);
            cartDTOs.add(cartDTO);
        });
        return cartDTOs;
    }

    @Override
    public Map<CartStatus, Long> getCartsByCategory(Long productCategoryId) {
        List<Cart> carts = cartRepository.getByProducts_categories_id(productCategoryId);

        Map<CartStatus, Long> result = carts.stream()
                .collect(Collectors.groupingBy(Cart::getStatus, Collectors.counting()));

        System.out.println(result);

        return result;
    }

    @Override
    public Map<CartStatus, Long> productStatus(Long productId) {
        List<Cart> carts = cartRepository.getByProducts_id(productId);

        Map<CartStatus, Long> result = carts.stream()
                .collect(Collectors.groupingBy(Cart::getStatus, Collectors.counting()));

        return result;
    }

    private CartDTO prepareCartDTO(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setId(cart.getId());
        if (cart.getUser() != null)
            cartDTO.setUserId(cart.getUser().getId());
        cartDTO.setStatus(cart.getStatus());

        List<ProductDTO> productDTOs = new ArrayList<>();

        if (cart.getProducts() != null) {
            cart.getProducts().forEach((Product product) -> {
                ProductDTO productDTO = prepareProductDTO(product);
                productDTOs.add(productDTO);
            });
        }
        cartDTO.setProducts(productDTOs);

        return cartDTO;
    }

    private ProductDTO prepareProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());

        List<ProductCategoryDTO> productCategoryDTOs = new ArrayList<>();
        product.getCategories().forEach((ProductCategory productCategory) -> productCategoryDTOs.add(new ProductCategoryDTO(productCategory.getId(), productCategory.getName())));
        productDTO.setCategories(productCategoryDTOs);

        return productDTO;
    }

}
