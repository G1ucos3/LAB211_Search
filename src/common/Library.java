package common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Library {
    public int getInt(String promt, int m, int n){
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print(promt + ": ");
            try{
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e){
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int size){
        int[] array = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array){
        for(int i = 0; i < array.length; i++){
            if (i < array.length - 1){
                System.out.print(array[i] + ", ");
            } else{
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }
}