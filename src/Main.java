import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Sortowanie przez wstawianie");

        double[] arrayNumber = {100, 14, 1, 6, 29, 11, 58, 28};
        System.out.println("Przed posortowaniem");
        for (double i : arrayNumber) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arrayNumber);

        System.out.println("Po posortowaniu");
        for (double i : arrayNumber) {
            System.out.print(i + " ");
        }

    }


    public static void insertionSort(double[] doubleArray) {
        double temp;
        int arrayLength = doubleArray.length;
        for (int i = 1; i < arrayLength; i++) {
            temp = doubleArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if(doubleArray[j] > temp){
                    doubleArray[j+1] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
    }

}