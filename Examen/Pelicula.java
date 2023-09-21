package PSP.Examen;

public class Pelicula extends Producto {
    
    protected String Group;
    protected String Director;

    public Pelicula(String title, float price, int discountProduct) {
        super(title, price, discountProduct);
        Group = "Desconocido";
        Director = "Desconocido";
    }
    
}
