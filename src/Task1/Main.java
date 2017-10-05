package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Таблица умножение до 10
        Scanner scanner = new Scanner(System.in);

        int A=0;
        System.out.println ( "Введите строку ");
        A= scanner.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println( A*i);
        }
    }
}
