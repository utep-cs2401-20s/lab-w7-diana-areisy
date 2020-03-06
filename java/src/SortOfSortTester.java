import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTester {

    //First test is to make sure the method is working.
    @Test
    public void sortOfSort1(){

        int[] A = {3, 1, 4, 5, 2};
        int[] B = {3, 2, 1, 4, 5};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }

    //Second test is to make sure the method
    // works with repeated numbers.
    @Test
    public void sortOfSort2(){

        int[] A = {5, 2, 1, 5, 1};
        int[] B = {2, 1, 1, 5, 5};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }

    // Third test checks that method works
    // with negative numbers.
    @Test
    public void sortOfSort3(){

        int[] A = {0, 1, 35, 5, -30};
        int[] B = {1, 0, -30, 5, 35};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }
    //Fourth test checks that method works with
    // only negative numbers.
    @Test
    public void sortOfSort4(){

        int[] A = {-1, -2,- 3, -4, -5, -6, -7, -8, -9, -10};
        int[] B = {-3, -4, -7, -8, -10, -9, -6, -5, -2, -1};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }
    //Fifth test checks that the method
    // works when the array has one integer.(Best case)
    @Test
    public void sortOfSort5(){

        int[] A = {1};
        int[] B = {1};
        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);

    }

}