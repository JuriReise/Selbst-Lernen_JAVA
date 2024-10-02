package Type_Daten;

public class Объявлениеметода2 {
    public static void main(String[] args) {
        int myNumber = 5;
        increment(myNumber);
        System.out.println(myNumber); // Выведет 5
    }

    public static void increment(int number) {
        number++;


        //Как изменить значение переменной?

        //Чтобы метод изменял значение переменной,
        // нужно возвращать новое значение или использовать ссылочные типы
        // (например, массивы или объекты). Пример с возвращением значения:

        //return number + 1; // Возвращает увеличенное значение
    }

// Использование:
    //myNumber = increment(myNumber); // Теперь myNumber будет 6



}
