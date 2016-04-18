package it.sevenbits.reversion_with_generics.reversion;

import it.sevenbits.reversion_with_generics.interfaces.IReversion;

/**
 * IReversion interface implementation
 */
public class Reversion implements IReversion {
    /**
     * Method for reversing array
     * @param array incoming array of arbitrary type elements
     * @param <T> type
     * @throws NullPointerException exception
     */
    public <T> void reverse(final T[] array) throws NullPointerException {
        for (int i = 0; i < array.length / 2; i++) {
            T buf = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buf;
        }
    }
}
