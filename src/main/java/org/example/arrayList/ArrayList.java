package org.example.arrayList;

import java.util.Collection;

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
    return false;
  }


  @Override
  public boolean add(Object o) {
    if (array.length > 0) {
      Object[] newArray = new Object[array.length + 1];
      for (int i = 0; i < newArray.length; i++) {
        newArray[i] = i;
      }
      newArray[newArray.length -1] = o;
      array = newArray;
    } else {
      array = new Object[]{0};
    }
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
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
