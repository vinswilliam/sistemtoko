public class Item {

    private int id;
    private String category;
    private String itemName;
    private long price;
    private int stock;
    private int display;
    private String supplier;

    //constructor
    public Item() {
    }

    //aksesmod[spasi]namaKelas()
    public Item(int mId, String category, String itemName, long price,
                int stock, int display, String supplier) {
        this.id = id;
        this.category = category;
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
        this.display = display;
        this.supplier = supplier;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
