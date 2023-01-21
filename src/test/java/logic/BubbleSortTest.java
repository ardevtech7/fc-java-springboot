package logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList1() {
        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        // When
        List<Integer> actual = bubbleSort.sort(List.of(5,4,3,2,1));

        // Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }

    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList2() {
        // Given
        JavaSort<Integer> javaSort = new JavaSort<>();
        // When
        List<Integer> actual = javaSort.sort(List.of(5,4,3,2,1));

        // Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }

}