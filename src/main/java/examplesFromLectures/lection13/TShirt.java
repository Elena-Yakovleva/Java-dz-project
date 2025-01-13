package examplesFromLectures.lection13;

public class TShirt extends Product {

    // Класс является дополнительным и содержит информацию о параметрах характерных для данного класса
    private String color;
    private String size;
    private String gender;

    public TShirt(int id, String name, int price, String color, String size, String gender) {
        super(id, name, price);
        this.color = color;
        this.size = size;
        this.gender = gender;
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 8_000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void use() {
        System.out.println("Носим футболку " + name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
