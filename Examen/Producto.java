package PSP.Examen;

public abstract class Producto{
    protected String title;
    protected float price;
    protected int discountProduct= 0;
    
    public Producto(String title, float price, int discountProduct) {
        this.title = title;
        this.price = price;
        this.discountProduct = discountProduct;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDiscountProduct() {
        return discountProduct;
    }

    public void setDiscountProduct(int discountProduct) {
        this.discountProduct = discountProduct;
    }

    


}
