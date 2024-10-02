package Type_Daten;

public class TypeDaten {

    public static void main(String[] args) {

        byte smallNumber = 100;     // byte : Целое число от -128 до 127 (1 байт).
        short mediumNumber = 30000; // short: Целое число от -32,768 до 32,767 (2 байта).
        int number = 100000;        // int: Целое число от -2^31 до 2^31-1 (4 байта).
                                    //  (примерно от -2 миллиардов до +2 миллиардов)
        long bigNumber = 10000000000L; // long: Целое число от -2^63 до 2^63-1 (8 байт).
                                        // порядка девяти квинтиллионов
        float floatNumber = 5.75f;  // float: Число с плавающей точкой одинарной точности (4 байта).
        double doubleNumber = 19.99; // double: Число с плавающей точкой двойной точности (8 байт).
        char letter = 'A';          // char: Один символ Unicode (2 байта).
        boolean isJavaFun = true;   // boolean: Может иметь только два значения: true или false (1 бит,
                                    // но обычно размер зависит от реализации).

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);


    } // end of main

} // end of class
