package com.finaltest;

import java.util.Iterator;

//
//private class Nodes<E> {
//    E item;
//    Nodes<E> next;
//    Nodes<E> prev;
//    Nodes(Nodes<E> prev, E element, Nodes<E> next) {
//        this.item = element;
//        this.next = next;
//        this.prev = prev;
//    }
//}
public interface Lista<E>{
    void add(E x);
    Iterator<E> iterator();

}

//
//public interface Iterator<E>{
//    E next();
//    boolean hasNext();
//}