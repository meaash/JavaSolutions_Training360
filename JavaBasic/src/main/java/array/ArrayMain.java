package array;

import java.util.Random;

public class ArrayMain {
    public static void main(String[] args) {
       // String[] weekdays = new String[7];
          String[] weekdays = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
          System.out.println(weekdays[1]);
          System.out.println(weekdays.length);

          int[] numbers = new int[5];
          for (int i = 0; i < numbers.length ; i++) {
                 numbers[i] = i;
              System.out.println(numbers[i] + " ");
            }

        System.out.println("-------------------------");
          boolean[] trueorfalsearr = new boolean[5];
            for (int i = 0; i < trueorfalsearr.length; i++) {
                trueorfalsearr[i]=false;
                if (i !=0){
                if(!trueorfalsearr[i-1]){
                trueorfalsearr[i]=true;}
                else{trueorfalsearr[i]=false;}
                }
                System.out.print(trueorfalsearr[i] + " ");
            }

        System.out.println();
        System.out.println("-------------------------");

          //Math random osztályok
        double tomb[] = new double [5];
        for (int i = 0; i < tomb.length; i++){
            tomb[i] = Math.random();
            System.out.println(tomb[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------------");

        int tomb2[] = new int [10];
        int veletlenSzam;
        for (int i = 0; i < tomb2.length; i++){
            veletlenSzam = (int)(Math.random() * 100);
            tomb2[i] = veletlenSzam;
            System.out.print(tomb2[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------");
        //Random osztály
        int tombrnd[] = new int [10];
        Random random = new Random();
        for (int i = 0; i < tombrnd.length; i++){
            tombrnd[i] = random.nextInt(100) + 1;
            System.out.print(tombrnd[i] + " ");
        }
    }

}
