package shiftproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private int id;
    private String name;
    private Product[] products;
    private Customer[] customers;
    private ArrayList<IUniversal> incomes = new ArrayList<IUniversal>();
    private ArrayList<IUniversal> sales = new ArrayList<IUniversal>();

    public Store(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addIncome() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mahsulot turini tanlang  ? ");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + 1 + "---" + products[i].getName());
            }
            System.out.print("::: ");
            int i = scanner.nextInt();
            Product product = products[i - 1];
            System.out.print("qancha qo'shmoqchisiz ---  ");
            int amount = scanner.nextInt();
            System.out.print("Mahsulot narxini kiriting ---  ");
            float price = scanner.nextFloat();
            Income income = new Income(product, amount, price);
            incomes.add(income);
            System.out.println("yana qo'shasizmi ? ");
            System.out.println("1 --- Ha");
            System.out.println("2 --- Yoq");
            System.out.print("::::: ");
            switch (scanner.nextInt()) {
                case 1:
                    continue;
                case 2:
                    showInfo(incomes);
                    return;
                default:
                    System.out.println("mavjud bulmagan raqam !");
            }
        }
    }

    public void addSale() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mahsulot turini tanlang  ? ");
            for (int i = 0; i < products.length; i++) {
                System.out.println(i + 1 + "---" + products[i].getName());
            }
            System.out.print("::: ");
            int i = scanner.nextInt();
            Product product = products[i - 1];
            System.out.print("qancha olmoqchisiz ---  ");
            int amount = scanner.nextInt();
            System.out.print("Mahsulot narxini kiriting ---  ");
            float price = scanner.nextFloat();
            Sale sale = new Sale(product, amount, price);
            sales.add(sale);
            System.out.println("yana qo'shasizmi ? ");
            System.out.println("1 --- Ha");
            System.out.println("2 --- Yoq");
            System.out.print("::::: ");
            switch (scanner.nextInt()) {
                case 1:
                    continue;
                case 2:
                    showInfo(sales);
                    return;
                default:
                    System.out.println("mavjud bulmagan raqam !");
            }
        }
    }

    private void showInfo(ArrayList<IUniversal> iUniversals) {
        for (IUniversal iUniversal : iUniversals) {
            iUniversal.showProducts();
        }
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setIncomes(ArrayList<IUniversal> incomes) {
        this.incomes = incomes;
    }

    public Product[] getProducts() {
        return products;
    }

    public ArrayList<IUniversal> getIncomes() {
        return incomes;
    }

    public ArrayList<IUniversal> getSales() {
        return sales;
    }
}
