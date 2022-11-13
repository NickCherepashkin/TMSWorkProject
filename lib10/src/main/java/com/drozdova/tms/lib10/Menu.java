package com.drozdova.tms.lib10;

import java.util.Scanner;

public class Menu {
    private int num;
    private Scanner scanner;
    private Store store;

    public void start() {
        show();
    }

    private void show() {
        scanner = new Scanner(System.in);
        store = new Store();

        do {
            System.out.println("===========================");
            System.out.println("===         Menu        ===");
            System.out.println("===========================");
            System.out.println("1. Get all products");
            System.out.println("2. Adding a product");
            System.out.println("3. Product removal");
            System.out.println("4. Editing a product");
            System.out.println("5. Exit");
            selectMenu();
        } while (num != 5);
    }

    private void selectMenu() {
        System.out.println("Select menu item (1-5)");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        num = scanner.nextInt();
        switch (num) {
            case 1:
                menuGetList();
                break;
            case 2:
                menuAdd();
                break;
            case 3:
                menuDelete();
                break;
            case 4:
                menuEdit();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Select 1-5");
                break;
        }
    }

    private void menuGetList() {
        do {
            System.out.println("Select sort type:");
            System.out.println("1. by price (asc)");
            System.out.println("2. by price (desc)");
            System.out.println("3. by adding");
            System.out.println("0. back");

            while (!scanner.hasNextInt()) {
                System.out.println("wrong value!");
                scanner.next();
            }
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    store.sortingListByAsc();
                    num = 0;
                    break;
                case 2:
                    store.sortingListByDesc();
                    num = 0;
                    break;
                case 3:
                    store.sortingListByAdding();
                    num = 0;
                    break;
                case 0: break;
                default:
                    System.out.println("Enter 0-3");
                    break;
            }
        } while (num != 0);
    }

    private void menuAdd() {
        int id;
        String title;
        int price;
        System.out.print("Enter product id: ");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        id = scanner.nextInt();

        System.out.print("Enter product title: ");
        title = scanner.next();

        System.out.print("Enter product price: ");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        price = scanner.nextInt();

        store.addProduct(id, title, price);
    }

    private void menuDelete() {
        int id;
        System.out.print("Enter product id: ");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        id = scanner.nextInt();

        store.deleteProduct(id);
    }

    private void menuEdit() {
        int id;
        String title;
        int price;
        System.out.print("Enter product id: ");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        id = scanner.nextInt();

        System.out.print("Enter new product title: ");
        title = scanner.next();

        System.out.print("Enter new product price: ");
        while (!scanner.hasNextInt()) {
            System.out.println("wrong value!");
            scanner.next();
        }
        price = scanner.nextInt();

        store.editProduct(id, title, price);
    }
}
