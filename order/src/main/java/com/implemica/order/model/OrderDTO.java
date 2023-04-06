package com.implemica.order.model;


import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@Builder
public class OrderDTO {

    Long id;

    @NotNull(message = "User id is required.")
    String user;

    Date orderDate;

    OrderStatus orderStatus;

    @NotNull(message = "Order total price is required.")
    BigDecimal orderTotalPrice;

    @NotNull(message = "User address is required.")
    String address;

    @NotNull(message = "Cars are required.")
    private List<Long> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Long> getCars() {
        return cars;
    }

    public void setCars(List<Long> cars) {
        this.cars = cars;
    }
}
