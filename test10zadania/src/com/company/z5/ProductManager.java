package com.company.z5;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
}
