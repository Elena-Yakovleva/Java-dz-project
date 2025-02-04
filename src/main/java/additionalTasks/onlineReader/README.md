### Задача 1. Онлайн-читалка
#### Описание
Представьте себе, что вы проектируете онлайн-читалку. Как вы думаете, какими объектами мы можем описать такое приложение? Одним из основных объектов этой предметной области являются книги. Давайте создадим общий класс Book для них.

Прежде чем приступить к описанию класса, нужно ответить на следующие вопросы:

* Какие характеристики объекта "книга" из реального мира нужно перенести в java class Book (например: количество страниц)?
* Какой тип будет у каждого поля создаваемого класса?
* Какие методы должны быть у созданного класса (например: сравнить две книги или вывести на печать)?
* Каким будет тип возвращаемых значений, и какими будут входные параметры для этих методов?

После такой подготовки создайте класс Book.java с выбранными полями и методами, которые будут полезны в онлайн-читалке. Добавьте метод toString() для этого класса, который будет выводить название каждого поля и его значение через запятую.

#### Функционал программы
* Созданный класс Book с методом toString, заполнением данных из конструктора и хотя бы одним дополнительным интересным методом.
* Демонстрация работы вашего класса в Main (общаться с пользователем, считывать его ввод не нужно)

#### Пример реализации

* Создадим класс-файл Book.java

### Задача 2. Книги и авторы

#### Описание

Добавим теперь в нашу систему авторов книг.

#### Функционал программы
* Класс "Автор" (Author), содержащий как минимум конструктор с параметрами и toString;
* Класс "Книга" (Book) из первого задания;
* Свяжите между собой классы Author и Book, чтобы среди типов полей одних классов встречались другие.

#### Пример реализации

* Создайте класс Author.
* Создайте класс Book.
* Подумайте, как можно связать между собой эти классы (как классы зависят друг от друга), и используйте один класс в другом.
* Демонстрация работы классов в Main.
* Выведите значения всех полей созданного объекта.

### Задача 3. Считаем онлайн-пользователей

#### Описание
Давайте научимся считать, сколько пользователей сейчас находится онлайн в нашей библиотеке. Будем считать, что пользователь онлайнится в момент создания его объекта и никогда не уходит в оффлайн. Для этого нужно создать класс "Пользователь" (User), среди полей должны быть как минимум: интернет-почта, имя и фамилия (email, name, surname).

#### Функционал программы
* Класс User;
* Подсчет созданных пользователей;
* Демонстрация работы подсчёта в Main;
* Для работы подсчёта пользователей в Main не должно предприниматься никаких дополнительных действий помимо создания объектов класса User.

#### Пример реализации
* Создадим класс User.
* Добавим к этому классу статическое поле totalOnline, в котором будем подсчитывать, сколько пользователей сейчас онлайн (не забудьте продумать тип данных для этой переменной).
* В классе Main в методе main необходимо создать не менее 3 пользователей.
* Заполните все объекты класса User (например, именами знаменитостей).
* Выведите в консоль, сколько пользователей находятся онлайн (значение поля User.totalOnline).

#### Результат
Итоговый результат, для практики, сделала с возможностью выбора книги в читалке через консоль.