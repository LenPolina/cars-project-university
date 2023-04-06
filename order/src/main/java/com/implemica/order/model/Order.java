package com.implemica.order.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import static com.implemica.order.model.OrderStatus.ORDERED;

@Entity
@Setter
@Getter
@Table(name = "car_order")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    Long id;

    @Column(name = "order_user", nullable = false)
    Long user;

    @Column(name = "car_order_date", nullable = false)
    Date orderDate;

    @Column(name = "car_order_status", nullable = false)
    OrderStatus orderStatus = ORDERED;

    @Column(name = "car_total_price", nullable = false)
    BigDecimal orderTotalPrice;

    @Column(name = "address", nullable = false)
    String address;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> cars;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
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
