package lection4.dz2;

public class BmiService {

    public int calculate (double height, double weight) {

        //height - рост пользователя в метрах
        //weight - вес пользователя в килограммах

        return (int) (weight / (height * height));
    }


}
