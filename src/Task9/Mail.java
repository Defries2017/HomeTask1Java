package Task9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mail {

    // Отредактировать заданное предложение, удаляя из него слова,
    // которые встречаются в предложении n раз.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите строку 1");
        String text = scanner.nextLine();

        String[] str = text.split(" ");


        String[] temp = str.clone();

        Arrays.sort(temp);


        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i].contentEquals(temp[i+1])) {
                temp[i] = ".";
            }
        }

        for (int i = 0; i < temp.length; i++) {
            //System.out.println(temp[i]);
        }

        String[] res = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {

            for (int j = 0; j < temp.length; j++) {

                if (temp[i].contentEquals(str[j])){
                    res[j] = temp[i] + " ";
                    break;
                }
            }
        }

        String a = "";

        for (int i = 0; i < res.length; i++) {
            //System.out.print(res[i] + " ");
            if (res[i] != null)
                a += res[i] + " ";
        }

        System.out.println(a);

    }

}
