package com.company.z5;

public class Product {
    private String productCategory;
    private String productName;
    private double productPrice;

    public Product(String productName, String productCategory, double productPrice) {
        if (checkStr(productName)) {
            this.productName = productName;
        } else {
            this.productName = "data error";
        }
        if (checkStr(productCategory)) {
            this.productCategory = productCategory;
        } else {
            this.productCategory = "data error";
        }
        if (productPrice >= 0.0 && checkStr(productName) && checkStr(productCategory)) {
            this.productPrice = productPrice;
        } else {
            this.productPrice = 0.0;
        }
    }

    private boolean checkStr(String str) {
        return str.length() >= 3 && str.toUpperCase().charAt(0) == str.charAt(0);
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String productToString() {
        return "Produkt{" + "nazwa: " + productName + "; kategoria: " + productCategory + "; cena netto:" + productPrice + "}";
    }
}
