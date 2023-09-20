import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.arrayList.ArrayList;
import org.example.arrayList.List;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

  @Test
  public void shouldReturnSize() {
    List listEmpty = new ArrayList();
    assertEquals(0, listEmpty.size());
    List list = new ArrayList(of(1, 2));
    assertEquals(2, list.size());
  }

  @Test
  public void shouldAddElement() {
    List list = new ArrayList();
    list.add(1);
    list.add(1);
    assertEquals(2, list.size());
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

}