package Homework06;

import java.util.HashMap;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public Order(HashMap<String,Object> orderData){
        
        this(
            (String) orderData.get("name"), 
            (String) orderData.get("product"), 
            (int)    orderData.get("qnt"), 
            (Double) orderData.get("price")
        );

    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return this.clientName;
    }

    public String getProduct() {
        return this.product;
    }

    public int getQnt() {
        return this.qnt;
    }

    public double getPrice() {
        return this.price;
    }

    

}
