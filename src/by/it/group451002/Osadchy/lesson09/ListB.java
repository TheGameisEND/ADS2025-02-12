package by.it.group451002.Osadchy.lesson09;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListB<E> implements List<E> {

    //Создайте аналог списка БЕЗ использования других классов СТАНДАРТНОЙ БИБЛИОТЕКИ

    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    //////               Обязательные к реализации методы             ///////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
    }

    @Override
    public boolean add(E e) {
    }

    @Override
    public E remove(int index) {
    }

    @Override
    public int size() {
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public E set(int index, E element) {
    }


    @Override
    public boolean isEmpty() {
    }

    @Override
    public void clear() {
    }

    @Override
    public int indexOf(Object o) {
    }

    @Override
    public E get(int index) {
    }

    @Override
    public boolean contains(Object o) {
    }

    @Override
    public int lastIndexOf(Object o) {
    }


    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    //////               Опциональные к реализации методы             ///////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
    }

    @Override
    public boolean retainAll(Collection<?> c) {
    }


    @Override
    public List<E> subList(int fromIndex, int toIndex) {
    }

    @Override
    public ListIterator<E> listIterator(int index) {
    }

    @Override
    public ListIterator<E> listIterator() {
    }

    @Override
    public <T> T[] toArray(T[] a) {
    }

    @Override
    public Object[] toArray() {
    }

    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    ////////        Эти методы имплементировать необязательно    ////////////
    ////////        но они будут нужны для корректной отладки    ////////////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    @Override
    public Iterator<E> iterator() {
    }

}
