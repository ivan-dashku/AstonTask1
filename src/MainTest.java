import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    @Test
    public void test1() {
        MyArrayList array = new MyArrayList();
        array.add(1);
        array.add(2);
        assertEquals(1, array.get(0));
        assertEquals(2, array.get(1));
    }

    @Test
    public void test2() {
        MyArrayList array = new MyArrayList();
        array.add(0, 0);
        array.add(2, 1);
        array.add(1, 1);
        assertEquals(0, array.get(0));
        assertEquals(1, array.get(1));
        assertEquals(1, array.get(2));
    }

    @Test
    public void test3() {
        MyArrayList array = new MyArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(1);
        assertEquals(1, array.get(0));
        assertEquals(3, array.get(1));
    }

    @Test
    public void test4() {
        MyArrayList array = new MyArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(Integer.valueOf(2));
        assertEquals(1, array.get(0));
        assertEquals(3, array.get(1));
    }

    @Test
    public void test5() {
        MyArrayList array = new MyArrayList();
        array.add(1);
        array.add(2);
        array.clear();
        assertEquals(0, array.size());
    }

    @Test
    public void test6() {
        MyArrayList array = new MyArrayList();
        array.add(1);
        array.add(2);
        assertEquals(2, array.size());
    }
}