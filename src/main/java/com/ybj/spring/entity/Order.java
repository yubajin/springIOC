package com.ybj.spring.entity;

import com.ybj.myspring.Component;
import com.ybj.myspring.Value;
import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

@Data
@Component("myOrder")
public class Order {
    @Value("xxx123")
    private String orderId;
    @Value("1000.0")
    private Float price;
}
