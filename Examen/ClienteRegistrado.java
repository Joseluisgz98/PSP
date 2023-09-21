package PSP.Examen;

public class ClienteRegistrado implements Cliente{
    
    private String Name;
    private String SubName;
    private String Id;
    private String Phone;
    private Float Money;
    private int Discount = 2;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSubName() {
        return SubName;
    }
    public void setSubName(String subName) {
        SubName = subName;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    public Float getMoney() {
        return Money;
    }
    public void setMoney(Float money) {
        Money = money;
    }
    public int getDiscount() {
        return Discount;
    }
    public void setDiscount(int discount) {
        Discount = discount;
    }
    @Override
    public boolean Pagar(float cantidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Pagar'");
    }
    @Override
    public int aplicarDesCuento(Producto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarDesCuento'");
    }



}