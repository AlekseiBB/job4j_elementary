package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {33, 14, 1, 23, 75, 61};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 14, 23, 33, 61, 75};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort8() {
        int[] data = new int[] {3, 4, 1, 55, 11, 8, 2, 45, 99};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 8, 11, 45, 55, 99};
        assertThat(result).containsExactly(expected);
    }
}
