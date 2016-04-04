package it.sevenbits.reversion_with_generics.interfaces;

import it.sevenbits.reversion_with_generics.exceptions.MyNullPointerException;

/**
 * Generic reversion interface
 */
public interface IReversion {
    /**
     * @param array incoming array of arbitrary type elements
     * @param <T> type of array elements
     * @throws MyNullPointerException exception
     * @return reversed array of arbitrary type elements
     */
    <T> T[] reverse(final T[] array) throws MyNullPointerException;
}
