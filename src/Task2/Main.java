package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая считывает символы пока не встретится точка.
        // Также предусмотрите вывод количества пробелов.
        Scanner scanner = new Scanner( System.in);

        String A=scanner.nextLine();

        int calldot=0;

        for (int i=0;i< A.length(); i++){

            if ( A.charAt(i) == '.')
                calldot = calldot + 1;

        }

        System.out.println(calldot);

    }
}
