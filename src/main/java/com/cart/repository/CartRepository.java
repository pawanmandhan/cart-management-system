package com.cart.repository;


import com.cart.model.Cart;
import com.cart.util.CartStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    //    @Query("SELECT id, products, status, user.id as userId from cart where status=:status")
//    @Query(
//            value = "select new package.CartwithProductCount(count(product.id) as productCount,c) from Cart cart join cart.products product group by cart",
//            countQuery = "select count(cart) from Cart cart"
//    )
//    @Query("SELECT DISTINCT e{}.label, COUNT(e.label) FROM Entity e GROUP BY e.label ORDER BY COUNT(e.label) DESC")
    List<Cart> getByStatus(CartStatus status, Pageable pageable);

    List<Cart> getByProducts_categories_id(Long productCategoryId);

    List<Cart> getByProducts_id(Long productId);
}
