package shiftproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "noutbook");
        Product product2 = new Product(2, "bakal");
        Product product3 = new Product(3, "mishka");
        Scanner scanner  = new Scanner(System.in);

        Store store = new Store(1,"Shift Market");
        Product[] products = {product,product2,product3};
        store.setProducts(products);

        System.out.println(store.getName() + " bozoriga xush kelibsiz !");
        while (true){
            System.out.println("Kirim  - 1");
            System.out.println("Chiqim - 2");
            System.out.print(":::: ");
            switch (scanner.nextInt()){
                case 1:
//                add income
                    store.addIncome();
                case 2:
//                add sale
                    store.addSale();
            }
        }
    }
}