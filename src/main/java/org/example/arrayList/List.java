package org.example.arrayList;

import java.util.Collection;

public interface List {

  public int size();

  public boolean isEmpty();

  public boolean contains(Object o);

  public boolean add(Object o);

  public boolean remove(Object o);

  public boolean remove(int index);

  public boolean addAll(Collection c);

  public Object get(int index);

  public int indexOf(Object o);
}
