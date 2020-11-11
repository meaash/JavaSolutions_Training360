package arrayofarrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.util.Arrays;

public class ArrayOfArraysMain {
    public static void main(String[] args) {

        //matrix feltöltése random számokkal
        int[][] tomb = new int[3][3];
        for( int i = 0; i < tomb.length; i++ )
        {
            for( int j = 0; j < tomb[i].length; j++ )
            {
                tomb[i][j] = (int)(Math.random()*10);
            }
        }

        // írjuk ki a tömböt
        for( int i = 0; i < tomb.length; i++ )
        {
            for( int j = 0; j < tomb[i].length; j++ )
            {
                System.out.print(tomb[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        int[][] myszorzo = multiplicationTable(4);
        printArrayOfArrays(myszorzo);
        System.out.println("-----------------");
        int[][] mytriangular = triangularMatrix(4);
        printArrayOfArrays(mytriangular);
        System.out.println("-----------------");
        getValues();


    }

    public static int[][] multiplicationTable(int size){

        int matrix[][] = new int[size][size];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (i+1)*(j+1);
            }
        }
        return matrix;
    }

    public static void printArrayOfArrays(int matrix[][]){
        for( int i = 0; i < matrix.length; i++ )
        {
            for( int j = 0; j < matrix[i].length; j++ )
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] triangularMatrix(int size){
        int matrix[][] = new int[size][];

        for(int i = 0; i < matrix.length; i++){
            matrix[i] = new int[i+1];
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i;
            }
        }

        return matrix;
    }

    public static int[][] getValues(){
        int matrix[][] = new int[12][];
        // matrix[0] =new int [31];
        // matrix[1] =new int [28];
        // matrix[1] =new int [31];
        // matrix[1] =new int [30];


        //.....
        for( int i = 0; i < matrix.length; i++ )
        {
            YearMonth yearMonthObject = YearMonth.of(LocalDateTime.now().getYear(), i+1);
            matrix[i] = new int[yearMonthObject.lengthOfMonth()];
            for( int j = 0; j < matrix[i].length; j++ )
            {
               // matrix[i][j] = j+1;
                Arrays.fill(matrix[i], j+1);
            }
        }
        String output = "";
        for( int i = 0; i < matrix.length; i++ )
        {
            for( int j = 0; j < matrix[i].length; j++ )
            {
                if(String.valueOf(matrix[i][j]).length() == 1) {
                    output += "__" +matrix[i][j] + "_";
                }
                else{
                    output += "_" +matrix[i][j] + "_";
                }
            }
            output += "\n";
        }
        System.out.println(output);
        return matrix;
    }
}
