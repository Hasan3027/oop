package shiftproject;

public class Market {

    public Product product;
    public int amount;
    public float price;

    public Market(Product product, int amount, float price) {
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public void showProducts() {
        System.out.println("----------");
        System.out.println("Mahsulot nomi : " + product.getName()
                + "\nmahsulot miqdori --- " + amount + "\n" +
                "mahsulot narxi --- " + price
        );
        System.out.println("----------");
    }
}
