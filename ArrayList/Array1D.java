package DataStructure.ArrayList;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int[] a = new int[n];

        for (int j = 0; j<n;j++)
        {
            a[j] = scan.nextInt();
        }

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    }
