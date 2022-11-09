package com.drozdova.tms.lib10;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList;

    public Store() {
        productList = new ArrayList<>();
    }

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        boolean isExist = false;
        for (Product item: productList) {
            if (item.getId() == product.getId()) {
                isExist = true;
                System.out.println("EST....");
            }
        }
        if (!isExist) {
            productList.add(product);
        }
    }

    public void deleteProduct(int id) {
        boolean isDeleted = false;
        for (Product item: productList) {
            if (item.getId() == id) {
                isDeleted = productList.remove(item);
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("NET...");
        }
    }

    public void editProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
            }
        }
    }
}
