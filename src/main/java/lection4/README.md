# Задание 1 

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы уже научились создавать классы и методы. Поэтому вам необходимо модернизировать приложение для расчёта миль. Напомним, мили начисляются как 1 миля за каждые 20 рублей в стоимости билета, дробные мили не допускаются.

Теперь сама логика расчёта будет находиться в специально выделенном классе сервиса, а в Main мы будем лишь создавать объект этого сервиса и вызывать его метод, передавая аргументами все необходимые данные для расчёта. Получив от вызова метода рассчитанный результат, мы выведем его на экран.

Создайте класс BonusMilesService: File -> New -> Java Class, вводите название и нажимаете Enter.

Определите в нём метод calculate, который:

* принимает на вход один параметр: цену билета, типа int;
* анализируя значение переданного параметра, возвращает рассчитанное количество миль.

Разместите следующий код в классе Main:
````
public class Main {
  public static void main(String[] args) {
    BonusMilesService service = new BonusMilesService();
    int price = 10_000;
    int miles = service.calculate(price); // должно получиться 500
    System.out.println(miles);
  }
}
````
Убедитесь, что выводимое в консоль значение соответствует логике расчёта бонуса. Проверьте на разных примерах.

# Задание 2 

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вы решили написать сервис, который рассчитывает индекс массы тела (body mass index).

Формулу расчёта bmi-индекса вам предстоит найти самостоятельно. Сервисный метод должен возвращать целое число. Чтобы дробное превратить в целое, можете использовать приведение типов: (int) index, где index имеет дробный тип. Пример для самопроверки: для роста 1.87 метра и веса 98 кг он будет 28.

Создайте класс BmiService с методом calculate:

* который принимает все нужные данные в параметрах;
*  названии параметров указаны единицы измерения, например, в метрах ли вы принимаете рост;
* метод возвращает посчитанный bmi-индекс в виде целого числа.
* 
Продемонстрировать в Main по аналогии с первой задачей:

* создание объекта;
* вызов метода calculate;
* печать в консоль результата, проверьте, что ваша программа считает правильно, сравнив его со своими примерами.

# Задание 3 

В этой задаче мы считаем, что пользователь вводит корректные значения входных данных.

Вам поручили написать кредитный калькулятор, который считает как на сайте. Но формулы, естественно, не дали.

Вам нужно провести небольшой анализ и написать свой CreditPaymentService, который умеет рассчитывать ежемесячный платёж (см. аннуитетный платёж).

Параметры, их количество, типы, а также формулу вам необходимо определить самим.

Обратите внимание: на тех же данных ваш сервис должен считать так же.

Чтобы это продемонстрировать, в Main создайте объект и три раза вызовите его метод calculate. Результаты каждого вызова выводите в консоль.

Скриншоты для решения задачи. Важно: это не реальный сервис.

![image](https://user-images.githubusercontent.com/53707586/212545840-11c9918b-832a-4f19-9ade-29e5c259ecf8.png)

![image](https://user-images.githubusercontent.com/53707586/212545847-3b72640a-3c13-49dd-bacd-0020c8d4966a.png)

![image](https://user-images.githubusercontent.com/53707586/212545851-949d5826-82dc-47f7-b18a-e476819633af.png)

Подсказка: для возведения чисел в степень в Java изучите и используйте команду Math.pow.


## Сделанное ДЗ
1. dz1 - BonusMilesService - расчет количества бонусных миль
2. dz2 - BmiService - расчет индекса массы тела
3. cd3 - CreditPaymentService - кредитный калькулятор

