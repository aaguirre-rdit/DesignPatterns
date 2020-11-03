package com.wandercoder;

import com.wandercoder.controller.PaypalAlgorithm;
import com.wandercoder.controller.ShoppingCart;
import com.wandercoder.model.Product;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product(25, "234");
        Product shirt = new Product(15, "987");

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // payment decisions

        cart.pay(new PaypalAlgorithm("anne@gmail.com","pass1234"));


    }
}
