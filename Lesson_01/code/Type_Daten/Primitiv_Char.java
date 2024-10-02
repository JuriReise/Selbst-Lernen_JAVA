package Type_Daten;

public class Primitiv_Char {
    public static void main(String[] args) {

        char letter = 'A';         // Обычный символ
        char number = '1';         // Символ числа
        char specialChar = '#';    // Специальный символ
        char unicodeChar = '\u263A'; // Символ Unicode (смайлик)

        System.out.println("Символ: " + letter);
        System.out.println("Число как символ: " + number);
        System.out.println("Специальный символ: " + specialChar);
        System.out.println("Смайлик (Unicode): " + unicodeChar);

    } // end of main


} // end of class
