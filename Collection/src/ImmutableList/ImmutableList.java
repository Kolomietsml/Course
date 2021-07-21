package ImmutableList;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ImmutableList<E> extends AbstractList<E> {

    private E [] data;

    public ImmutableList() {
        this.data =(E[]) new Object[0];
    }

    @Override
    public boolean add(E o) {
        data = increaseSizeList();
        data[data.length - 1] = o;
        return true;
    }

    private E[] increaseSizeList() {
        return Arrays.copyOf(data, data.length + 1);
    }

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }
}
