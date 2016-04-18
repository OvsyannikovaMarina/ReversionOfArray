package it.sevenbits.reversion_with_generics.interfaces;


/**
 * Generic reversion interface
 */
public interface IReversion {
    /**
     * @param array incoming array of arbitrary type elements
     * @param <T> type of array elements
     * @throws NullPointerException exception
     */
    <T> void reverse(final T[] array) throws NullPointerException;
}
