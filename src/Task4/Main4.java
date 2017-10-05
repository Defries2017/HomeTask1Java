package Task4;

public class Main4 {
    public static void main(String[] args) {
        //Вывести на экран пять строк из нулей,
        // причем количество нулей в каждой строке равно номеру строки.

         String Zero = "0";

         for( int i =0 ;i < 5; i++){

             System.out.println(Zero );
             Zero = Zero + " 0";

         }

    }
}
