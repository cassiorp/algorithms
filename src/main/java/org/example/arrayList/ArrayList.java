package org.example.arrayList;

import static java.util.List.of;

import java.util.Collection;
import org.example.List;

public class ArrayList implements List {

  Object[] array;

  public ArrayList(Collection c) {
    array = c.toArray();
  }

  public ArrayList() {
    this.array = new Object[]{};
  }

  @Override
  public int size() {
    return array.length;
  }

  @Override
  public boolean isEmpty() {
    return array.length == 0;
  }

  @Override
  public boolean contains(Object o) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == o) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean add(Object o) {
    if (array.length > 0) {
      Object[] newArray = new Object[array.length + 1];
      for (int i = 0; i < array.length; i++) {
        newArray[i] = array[i];
      }
      int index = newArray.length - 1;
      newArray[index] = o;
      array = newArray;
    } else {
      array = new Object[]{o};
    }
    return true;
  }

  @Override
  public boolean remove(Object o) {
    Object[] newArray = new Object[array.length - 1];
    int indexNovoArray = 0;
    if (this.contains(o)) {
      for (int i = 0; i < array.length; i++) {
        if (!array[i].equals(o)) {
          newArray[indexNovoArray] = array[i];
          indexNovoArray++;
        }
      }
      array = newArray;
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean remove(int index) {
    if(index > array.length -1) {
      return false;
    }

    Object[] newArray = new Object[array.length - 1];
    int indexNovoArray = 0;
    for (int i = 0; i < array.length; i++) {
      if (index != i) {
        newArray[indexNovoArray] = array[i];
        indexNovoArray++;
      }
    }
    array = newArray;
    return true;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

}
