package Type_Daten;

public class IfElse_02 {
    public static void main(String[] args) {
        int age = 45;

        if (!(age > 18)) {
            System.out.println("Вы ещё ребёнок");
        } else if (age > 18 && !(age > 65)) {
            System.out.println("Вы взрослый");
        } else if (!(age <= 65)) { // (!(age <= 65)) Читается как НЕ МЕНЬШЕ 65
            System.out.println("Вы пенсионер");
        }

    } // end of main

} // end of class


