package com.ecoomerce.sportscenter.service;

import java.util.List;

import com.ecoomerce.sportscenter.entity.Basket;
import com.ecoomerce.sportscenter.model.BasketResponse;

public interface BasketService {
    List<BasketResponse> getAllBaskets();
    BasketResponse getBasketById(String basketId);
    void deleteBasketById(String basketId);
    BasketResponse createBasket(Basket basket);
}
