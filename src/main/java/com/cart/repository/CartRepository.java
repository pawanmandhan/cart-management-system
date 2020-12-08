package com.cart.repository;


import com.cart.model.Cart;
import com.cart.util.CartStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    //    @Query("SELECT id, products, status, user.id as userId from cart where status=:status")
    List<Cart> getByStatus(CartStatus status);

    List<Cart> getByProducts_categories_id(Long productCategoryId);

    List<Cart> getByProducts_id(Long productId);
}
