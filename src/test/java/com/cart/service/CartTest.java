package com.cart.service;

import com.cart.dto.CartDTO;
import com.cart.model.Cart;
import com.cart.repository.CartRepository;
import com.cart.service.impl.CartServiceImpl;
import com.cart.util.CartStatus;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
public class CartTest {

    @Mock
    private CartRepository cartRepository;

    @InjectMocks
    private CartServiceImpl cartService;

    @Test
    void shouldReturnCartSuccessFully() {
        List<Cart> carts = Arrays.asList(new Cart(1L, null, null, CartStatus.ACTIVE));
        given(cartRepository.getByStatus(CartStatus.ACTIVE)).willReturn(carts);

        List<CartDTO> cartsByStatus = cartService.getCartsByStatus(CartStatus.ACTIVE);
        assertThat(cartsByStatus).isNotNull();
        assertThat(cartsByStatus.size() > 0).isEqualTo(true);

    }
}
