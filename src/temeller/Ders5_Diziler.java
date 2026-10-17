package temeller;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ders5_Diziler {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        System.out.println(numbers.length);

        String[] names = {"LeBron", "Curry", "Kevin"};
        System.out.println(names[1]);

        int[] scores = {70,85,90,60};

        for (int i = 0; i < names.length + 1; i++) {
            System.out.println("index " + i + " : " + scores[i]);
        }

        int sum = 0;

        for(int score: scores){
            sum += score;
        }
        System.out.println("sum = " + sum);
        System.out.println("average : " + (double) sum / scores.length);

        int max =  scores[0];

        for (int score: scores) {
            if (score > max) {
                max = score;
            }
        }

        System.out.println("max = " + max);


        int[] unsorted = {5, 2, 9, 1};
        Arrays.sort(unsorted);
        System.out.println(Arrays.toString(unsorted));


        int[] original = {1,2,3};
        int[] same = original;
        same[0] = 99;
        System.out.println(original[0]);


        int[] copy = Arrays.copyOf(original, original.length);
        copy[1] = 77;
        System.out.println(original[1]);
        System.out.println(copy[1]);


        int[][] matrix = {
                {1,2,3},
                {4,5,6},
        };

        System.out.println(matrix[1][2]);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

}
