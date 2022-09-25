public class Product {
   private int id;
    private String name;
    private String description;
    private String renk;
    private  String kod;

    public Product(int id, String name, String description, String renk, String kod, double price, int stockAmount) {
        System.out.println("Yapıcı Blok çalıştırıldı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.renk = renk;
        this.kod = kod;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product(int i, String laptop_, String asus_laptop, int i1, int i2, String black) {

    }

    private double price;
    private   int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


















}
