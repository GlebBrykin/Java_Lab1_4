import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Random rand = new Random();
        int[] arr1 = new int[10];
        for(int i = 0; i < arr1.length; ++i)
            System.out.print((arr1[i] = rand.nextInt(0, 10)) + " ");
        double mean = 0;
        for(int j : arr1)
            mean += j;
        System.out.println();
        System.out.println("Среднее значение = " + (mean / arr1.length));

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        int[] arr2 = new int[10];
        for(int i = 0; i < arr2.length; ++i)
            System.out.print((arr2[i] = rand.nextInt(0, 10)) + " ");
        for(int i = 0; i < (arr2.length / 2); ++i)
        {
            int tmp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = tmp;
        }
        System.out.println();
        for(int j : arr2)
            System.out.print(j + " ");
        System.out.println();

        System.out.println("********************");
        System.out.println("Задача 3");
        System.out.println("********************");
        double[][] marks = new double[][]{{3, 5, 4, 5},
                                          {5, 4, 5, 5},
                                          {3, 4, 3, 5}};
        for(int i = 0; i < marks.length; ++i)
        {
            double mean_stud = 0;
            double[] stud = marks[i];
            for(double v : stud)
                mean_stud += v;
            System.out.printf("Студент № %d: средний балл = %f\n", i + 1, mean_stud / stud.length);
        }
    }
}