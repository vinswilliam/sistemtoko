public class Cart {

    private int id;
    private Item[] listItem;
    private int totalPrice;
    private double disc;
    private int totalDisc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item[] getListItem() {
        return listItem;
    }

    public void setListItem(Item[] listItem) {
        this.listItem = listItem;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public int getTotalDisc() {
        return totalDisc;
    }

    public void setTotalDisc(int totalDisc) {
        this.totalDisc = totalDisc;
    }
}
