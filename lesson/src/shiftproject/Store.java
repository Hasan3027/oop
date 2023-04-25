package shiftproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private int id;
    private String name;
    private Product[] products;
    private Customer[] customers;
    private ArrayList<Bargain> incomes = new ArrayList<>();
    private ArrayList<Bargain> sales = new ArrayList<>();
    private Scanner scannerInt = new Scanner(System.in);
    private Scanner scannerStr = new Scanner(System.in);

    public Store(int id, String name) {
        this.id = id;
        this.name = name;
        Product product = new Product(1, "noutbook");
        Product product2 = new Product(2, "bakal");
        Product product3 = new Product(3, "mishka");
        this.products = new Product[]{product, product2, product3};
    }

    public void handleStart() {
        System.out.println(this.getName() + " bozoriga xush kelibsiz !");
        while (true) {
            System.out.println("Kirim  - 1");
            System.out.println("Chiqim - 2");
            System.out.print(":::: ");
            switch (scannerInt.nextInt()) {
                case 1:
//                add income
                    addIncome();
                    break;
                case 2:
//                add sale
                    addSale();
                    break;
            }
        }
    }

    private void addIncome() {
        handleBargain(incomes, new Income());
    }

    private void addSale() {

        handleBargain(sales, new Sale());
    }

    private void handleBargain(List<Bargain> bargainTypeList, Bargain bargainType) {
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        while (a) {
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
            bargainType.setAmount(amount);
            bargainType.setProduct(product);
            bargainType.setPrice(price);
            bargainTypeList.add(bargainType);
            System.out.println("yana qo'shasizmi ? ");
            System.out.println("1 --- Ha");
            System.out.println("2 --- Yoq");
            System.out.print("::::: ");
            switch (scanner.nextInt()) {
                case 1:
                    continue;
                case 2:
                    showInfo(bargainTypeList);
                    a = false;
                    break;
                default:
                    System.out.println("mavjud bulmagan raqam !");
            }
        }
    }


    private void showInfo(List<Bargain> iUniversals) {
        for (Bargain iUniversal : iUniversals) {
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

    public void setIncomes(ArrayList<Bargain> incomes) {
        this.incomes = incomes;
    }

    public Product[] getProducts() {
        return products;
    }

    public ArrayList<Bargain> getIncomes() {
        return incomes;
    }

    public ArrayList<Bargain> getSales() {
        return sales;
    }
}
