public class SistemToko {

    public static void main(String args[]) {

        Item shoes = new Item();
        shoes.setId(1);
        shoes.setCategory("shoes");
        shoes.setDisplay(10);
        shoes.setItemName("Adidas");
        shoes.setStock(90);
        shoes.setPrice(1000);
        shoes.setSupplier("PT. Maha Karya");

        System.out.println("id: " + shoes.getId());
        System.out.println("category: " + shoes.getCategory());
        System.out.println("Stock display: " + shoes.getDisplay());
        System.out.println("Item name: " + shoes.getItemName());
        System.out.println("Stock: " + shoes.getStock());
        System.out.println("Price: " + shoes.getPrice());
        System.out.println("Supplier: " + shoes.getSupplier());

        Item sandal = new Item();
        sandal.setId(2);
        sandal.setCategory("sandal");
        sandal.setDisplay(10);
        sandal.setItemName("Swallow");
        sandal.setStock(90);
        sandal.setPrice(500);
        sandal.setPrice(750);

        System.out.println("\n");
        System.out.println("Item name: " + sandal.getItemName());
        System.out.println("category: " + sandal.getCategory());
        System.out.println("Price: " + sandal.getPrice());

        Item shirt = new Item(3,
                "shirt", "Billabong", 750,
                90, 10, "PT. Abadi Jaya");

        shirt.setCategory("Casual shirt");
        shirt.setPrice(2000);

        System.out.println("\n");
        System.out.println("shirt : " + shirt.getCategory());
        System.out.println("price : " + shirt.getPrice());

        Cart cart = new Cart();


    }

}
