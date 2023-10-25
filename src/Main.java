import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Math.random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Sortowanie przez wstawianie");
        System.out.println("Wpisz 1 dla losowania lub inną cyfrę od 1 aby wpisać liczby");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        System.out.println("Wpisz jaki ma być rozmiar tablicy");
        int sizeOfArray = scanner.nextInt();
        double[] doubleArray = new double[sizeOfArray];
        if (userChoice.equals("1")) {
            for (int i = 0; i < sizeOfArray; i++) {
                doubleArray[i] = (double) (int) (random() * 10000) / 100;
            }
        } else {
            System.out.printf("Wpisz kolejne %d liczb oddzielonych enterami\n", sizeOfArray);
            for (int i = 0; i < sizeOfArray; i++) {
                doubleArray[i] = loadNumber(scanner);
                scanner.nextLine();
            }
        }
        System.out.println("Przed sortowaniem");
        for (double itr : doubleArray) System.out.printf(itr + ", ");

        System.out.println();

        System.out.println("Po sortowaniu");
        insertionSort(doubleArray);
        for (double itr : doubleArray) {
            System.out.printf(itr + ", ");
        }
    }

    public static void insertionSort(double[] doubleArray) {
        double temp;
        int arrayLength = doubleArray.length;
        for (int i = 1; i < arrayLength; i++) {
            temp = doubleArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (doubleArray[j] > temp) {
                    doubleArray[j + 1] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
    }

    public static double loadNumber(Scanner scanner) {
        String strNumber = scanner.nextLine();
        boolean isNumber = true;
        for (int i = 0; i < strNumber.length(); i++) {
            if (strNumber.charAt(i) < 48 || strNumber.charAt(i) > 57) {
                System.out.println("To nie jest cyfra");
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            return parseDouble(strNumber);
        } else {
            System.out.println("Podaj cyfrę");
            return loadNumber(scanner);
        }
    }

}