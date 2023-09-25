package org.example.linkedList;

import java.util.Collection;
import org.example.List;

public class LinkedList implements List {

  Node first;
  Node last;

  @Override
  public int size() {
    int count = 0;
    while (first.next != null) {
      count++;
    }
    return count;
  }

  @Override
  public boolean isEmpty() {
    return first.equals(null);
  }

  @Override
  public boolean contains(Object o) {
    Node current = first;
    while (first.next != null) {
      if (o.equals(current.getData())) {
        return true;
      }
      current = first.getNext();
    }
    return false;
  }

  @Override
  public boolean add(Object o) {
    Node newNode = new Node(o);
    if (first.equals(null)) {
      first = newNode;
      last = newNode;
    } else {
      last.next = newNode;
      newNode.previous = last;
      last = newNode;
    }
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean remove(int index) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public Object get(int index) {
    int count = 0;
    Node current = first;
    while (first.next != null) {
      if(count == index) {
        return current.getData();
      }
      count++;
    }
    throw new RuntimeException("Invalid index");
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  public static class Node<E> {

    E data;
    Node<E> next;
    Node<E> previous;

    public Node(E data, Node<E> next, Node<E> previous) {
      this.data = data;
      this.next = next;
      this.previous = previous;
    }

    public Node(E data) {
      this.data = data;
    }

    public Node() {
    }

    public E getData() {
      return data;
    }

    public void setData(E data) {
      this.data = data;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }

    public Node<E> getPrevious() {
      return previous;
    }

    public void setPrevious(Node<E> previous) {
      this.previous = previous;
    }
  }
}



