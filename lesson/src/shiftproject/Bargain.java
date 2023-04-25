package shiftproject;

public abstract class Bargain {

    public Product product;
    public int amount;
    public float price;

    public Bargain() {

    }

    public void showProducts() {
        System.out.println("----------");
        System.out.println("Mahsulot nomi : " + product.getName()
                + "\nmahsulot miqdori --- " + amount + "\n" +
                "mahsulot narxi --- " + price
        );
        System.out.println("----------");
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    abstract void handleBargain();
}
