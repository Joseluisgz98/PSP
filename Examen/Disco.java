package PSP.Examen;

public class Disco extends Producto {
    protected String Group;
    protected int stock;

    public Disco(String title,float price,int discountProduct){
        super(title,price,discountProduct);
        Group = "Desconodico";
        stock = 0;
    }
    
}
