package com.gameSalePlatform.entities.concretes;

import com.gameSalePlatform.core.entities.Entity;

public class Sale extends Entity {
    private int id;
    private Game game;
    private Customer customer;
    private Discount discount;

    public Sale() {
    }

    public Sale(int id, Game game, Customer customer, Discount discount) {
        this.id = id;
        this.game = game;
        this.customer = customer;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
