package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {9, 2, 3, 4, 5, 6, 7, 8, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap0to7() {
        int[] input = {44, 25, 83, 12, 5, 56, 7, 88};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {88, 25, 83, 12, 5, 56, 7, 44};
        assertThat(result).containsExactly(expected);
    }
}