package Task3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        //Напишите программу, которая будет считать количество часов,
        // минут и секунд в n-ном количестве суток. n - ввести с консоли.

        Scanner scanner = new Scanner (System.in);

        System.out.print ( "количестве суток " );
        int N = scanner.nextInt();
        System.out.println("Days " + N);


        int Hours= 24*N;
        int Minutes = 60*Hours;
        int Seconds = 60*Minutes;
        System.out.println("Hours " + Hours);
        System.out.println("Minutes "+ Minutes);
        System.out.println("Seconds "+ Seconds );


    }

}
