package com.cart;

import com.cart.service.CartService;
import com.cart.util.CartStatus;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class CartManagementSystemApplicationTests {

	@InjectMocks
	private CartService cartService;

	@Test
	void contextLoads() {
		Map<CartStatus, Long> expectedResponse = new HashMap<>();
		Map<CartStatus, Long> cartStatus = cartService.productStatus(0L);

		Assert.isTrue(expectedResponse == cartStatus);
	}

}
