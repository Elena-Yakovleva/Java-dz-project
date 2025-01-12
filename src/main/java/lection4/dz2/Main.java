public class Main {
    public static void main(String[] args) {


        BmiService index = new BmiService();

//       int myBmi = index.calculate(1.87, 98);

//       System.out.println(myBmi);

        System.out.println();
        System.out.println("Рост: " + 1.87 + " метра, вес: " + 98 + " кг.");
        System.out.println("Ваш индекс массы тела: " + index.calculate(1.87, 98));

        System.out.println();
        System.out.println("Рост: " + 1.57 + " метра, вес: " + 67 + " кг.");
        System.out.println("Ваш индекс массы тела: " + index.calculate(1.57, 67));

        System.out.println();
        System.out.println("Рост: " + 1.63 + " метра, вес: " + 60.5 + " кг.");
        System.out.println("Ваш индекс массы тела: " + index.calculate(1.63, 60.5));

        System.out.println();
        System.out.println("Рост: " + 1.95 + " метра, вес: " + 132 + " кг.");
        System.out.println("Ваш индекс массы тела: " + index.calculate(1.95, 132));


    }
}