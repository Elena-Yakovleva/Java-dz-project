package examplesFromLectures.lection13;

public class Product {

    // Класс является основным и содержит информацию о параметрах присущих всем товарам.
    // Наследуется другими классами

    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Метод сравнивает стоимость товаров - наследуется другими классами
    public boolean isTooExpensive() {
        if (price > 1_000_000) {
            return true;
        } else {
            return false;
        }
    }

    public void use() {
        System.out.println("Продукт " + name + " используется.");
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
