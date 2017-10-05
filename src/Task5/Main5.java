package Task5;

public class Main5 {
    //Даны два трехзначных числа. Получите новое число при
    // соединением второго числа справа к первому без последних
    // цифр у каждого. Например, 123 и 456 Ответ: 1245

    public static void main(String[] args) {

        int A = 123;
        int B = 456;

        int C = (A/10)*100 + (B/10);

        System.out.println("Ответ: " + C);


    }
}
