package it.sevenbits.reversion_with_generics.main;

import it.sevenbits.reversion_with_generics.reversion.Reversion;
import java.util.Arrays;


/**
 * Main class shows program working
 */
public final class Main {

    /**
     * Default constructor
     */
    private Main() {
        /**
         * Not called
         */
    }

    /**
     * Entry point
     * @param args incoming arguments
     * @throws NullPointerException exception
     */
    public static void main(final String[] args) throws NullPointerException {
        Integer[] arr1 = {0, 1, 2, 3, 4, 5, 6};
        Character[] arr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Float[] arr3 = {0.11f, 2.0f, 3.33f, 5.75f, 10.10f};

        Reversion rev = new Reversion();

        System.out.println("Original array of Integer:");
        System.out.println(Arrays.toString(arr1));
        rev.reverse(arr1);
        System.out.println("Reversed array of Integer:");
        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("Original array of Character:");
        System.out.println(Arrays.toString(arr2));
        rev.reverse(arr2);
        System.out.println("Reversed array of Character:");
        System.out.println(Arrays.toString(arr2) + "\n");

        System.out.println("Original array of Float:");
        System.out.println(Arrays.toString(arr3));
        rev.reverse(arr3);
        System.out.println("Reversed array of Float:");
        System.out.println(Arrays.toString(arr3) + "\n");

        rev.reverse(null);
    }
}
