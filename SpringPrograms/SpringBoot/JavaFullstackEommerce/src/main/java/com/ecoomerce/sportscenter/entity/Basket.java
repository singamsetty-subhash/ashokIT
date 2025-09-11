package com.ecoomerce.sportscenter.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@RedisHash("Basket")
public class Basket {
    @Id
    private String id;
    private List<BasketItem> items = new ArrayList<>();
    public Basket(String id){
        this.id = id;
    }
}
