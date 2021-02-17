import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ThanosTest {

    // все элементы положительные
    @Test
    public void positiveTest() {
        int[] i = {97, 25, 42, 90, 71, 16, 82, 39, 36, 74};
        int[] r = {16, 25, 36, 39, 42, 71, 74, 82, 90, 97};
        i = Thanos.thanosSort(i);
        assertArrayEquals(r, i);
    }

    // все элементы одинаковые
    @Test
    public void similarTest() {
        int[] i = {97, 97, 97, 97, 97, 97, 97, 97, 97, 97};
        int[] r = {97, 97, 97, 97, 97, 97, 97, 97, 97, 97};
        i = Thanos.thanosSort(i);
        assertArrayEquals(r, i);
    }

    // массив с одним элементом
    @Test
    public void simpleTest() {
        int[] i = {97};
        int[] r = {97};
        i = Thanos.thanosSort(i);
        assertArrayEquals(r, i);
    }

    // массив с отрицательными элементами
    @Test
    public void negativeTest() {
        int[] i = {97, -9, 1, -8, 553};
        int[] r = {-9, -8, 1, 97, 553};
        i = Thanos.thanosSort(i);
        assertArrayEquals(r, i);
    }

    // пустой массив
    @Test
    public void emptyTest() {
        int[] i = {};
        int[] r = {};
        i = Thanos.thanosSort(i);
        assertArrayEquals(r, i);
    }
}
