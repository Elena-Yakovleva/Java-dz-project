public class Main {
    public static void main(String[] args) {


        BonusMilesService service = new BonusMilesService();

//        int price = 10_000;
//        int miles = service.calculate(price); // должно получиться 500

//        System.out.println(miles);


        System.out.println();
        System.out.println("Цена билета: " + 10000 + " рублей");
        System.out.println(service.calculate(10000));

        System.out.println();
        System.out.println("Цена билета: " + 1135 + " рублей");
        System.out.println(service.calculate(1135));

        System.out.println();
        System.out.println("Цена билета: " + 19 + " рублей");
        System.out.println(service.calculate(19));

        System.out.println();
        System.out.println("Цена билета: " + -10000 + " рублей");
        System.out.println(service.calculate(-10000));

    }
}