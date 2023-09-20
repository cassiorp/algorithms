import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.arrayList.ArrayList;
import org.example.arrayList.List;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

  @Test
  public void shouldReturnSizeZero() {
    List listEmpty = new ArrayList();
    assertEquals(0, listEmpty.size());
  }

  @Test
  public void shouldReturnSizeTwo() {
    List list = new ArrayList(of(1, 2));
    assertEquals(2, list.size());
  }

  @Test
  public void shouldAddElementWithEmptyConstructor() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(3, list.size());
    assertEquals(true, list.contains(2));

  }

  @Test
  public void shouldAddElementWithParameterConstructor() {
    List list = new ArrayList(of(1, 2));
    list.add(1);
    assertEquals(3, list.size());
    assertEquals(true, list.contains(2));
  }

  @Test
  public void shouldReturnEmpty() {
    List list = new ArrayList();
    assertEquals(true, list.isEmpty());
  }

  @Test
  public void shouldNotReturnEmpty() {
    List list = new ArrayList();
    list.add(1);
    assertEquals(false, list.isEmpty());
  }

  @Test
  public void shouldReturnContainsTrue() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(true, list.contains(1));
  }

  @Test
  public void shouldReturnContainsFalse() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(false, list.contains(4));
  }

  @Test
  public void shouldRemoveByObject() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(true, list.remove((Object) 2));
    assertEquals(true, list.contains((Object) 1));
    assertEquals(true, list.contains((Object) 3));
  }

  @Test
  public void shouldNotRemoveByObject() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(false, list.remove((Object) 5));
  }

  @Test
  public void shouldRemoveByIndex() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(true, list.remove(1));
    assertEquals(true, list.contains((Object) 1));
    assertEquals(true, list.contains((Object) 3));
  }


  @Test
  public void shouldNotRemoveByIndex() {
    List list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(false, list.remove(3));
    assertEquals(false, list.remove(4));
  }

}