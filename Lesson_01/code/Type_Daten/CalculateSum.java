package Type_Daten;

public class CalculateSum {
    // открытый статический метод, который ничего не возвращает (void), называется main
    public static void main(String[] args) { // начало метода
        int a = 15; // объявили переменную a
        int b = 20;// объявили переменную b
        int sum = summa(a, b);// вызываем метод для расчета значения
        return;
    }
    public static int summa(int x, int y) { // начало метода
        return x + y;
    }
}
