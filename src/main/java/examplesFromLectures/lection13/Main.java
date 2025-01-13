package examplesFromLectures.lection13;

public class Main {
    public static void main(String[] args) {

        // Book book = new Book(
        // В ячейку класса родителя всегда можно положить объект класса наследника
        // Для наследника будут доступны методы родителя, а так же методы которые есть и у наследника, и у родителя
        // Методы только наследника в этом случае использовать нельзя.
        Product book = new Book(
                1,
                "Моя весна",
                200,
                "Александр Шубкин",
                100,
                1947
        );
        book.setPrice(12_000);
        book.use();
        System.out.println(book.isTooExpensive());

    }
}
