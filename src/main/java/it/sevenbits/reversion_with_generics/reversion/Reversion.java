package it.sevenbits.reversion_with_generics.reversion;

import it.sevenbits.reversion_with_generics.exceptions.MyNullPointerException;
import it.sevenbits.reversion_with_generics.interfaces.IReversion;

/**
 * IReversion interface implementation
 */
public class Reversion implements IReversion {
    /**
     * Method for reversing array
     * @param array incoming array of arbitrary type elements
     * @param <T> type
     * @throws MyNullPointerException exception
     * @return reversed array of arbitrary type elements
     */
    public <T> T[] reverse(final T[] array) throws MyNullPointerException {
        if (array == null) {
            throw new MyNullPointerException();
        }
        final int two = 2;
        for (int i = 0; i < array.length / two; i++) {
            T buf = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buf;
        }
        return array;
    }
}
