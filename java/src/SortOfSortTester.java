import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTester {

    @Test
    public void sortOfSort(){

        int[] A = {3, 1, 4, 5, 2};
        int[] B = {1, 2, 3, 4, 5};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }

}