package com.drozdova.tms.lib10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Store {
    private List<Product> productList;
    private List<Product> listForSort;

    public Store() {
        productList = new ArrayList<>();
        listForSort = new ArrayList<>();
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
                System.out.println("A product with this id has already been added");
            }
        }
        if (!isExist) {
            productList.add(product);
            System.out.println("The product added successfully");
        }
    }

    public void addProduct(int id, String title, int price) {
        Product product = new Product(id, title, price);
        addProduct(product);
    }

    public void deleteProduct(int id) {
        boolean isDeleted = false;
        for (Product item: productList) {
            if (item.getId() == id) {
                isDeleted = productList.remove(item);
                System.out.println("The product deleted successfully");
                break;
            }
        }
        if (!isDeleted) {
            System.out.println("Product with this id is not listed");
        }
    }

    public boolean editProduct(Product product) {
        boolean isEdit = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                isEdit = true;
                break;
            }
        }
        return isEdit;
    }

    public void editProduct(int id, String title, int price) {
        Product product = new Product(id, title, price);
        boolean result = editProduct(product);
        if (result) {
            System.out.println("The product edited successfully");
        } else {
            System.out.println("Product with this id is not listed");
        }
    }

    private void sort(List<Product> list) {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Integer.compare(product1.getPrice(), product2.getPrice());
            }
        });
    }

    public void sortingListByAsc() {
        listForSort.clear();
        listForSort.addAll(productList);
        sort(listForSort);

        System.out.println(listForSort);
    }

    public void sortingListByDesc() {
        listForSort.clear();
        listForSort.addAll(productList);
        sort(listForSort);
        Collections.reverse(listForSort);

        System.out.println(listForSort);

    }

    public void sortingListByAdding() {
        listForSort.clear();
        listForSort.addAll(productList);
        Collections.reverse(listForSort);

        System.out.println(listForSort);
    }
}
