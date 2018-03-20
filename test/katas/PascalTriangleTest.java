package katas;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PascalTriangleTest {

    @Test
    public void pascalTriangleWithOneTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}};
        assertThat(PascalTriangle.pascal(1), is(pascalTriangle));
    }

    @Test
    public void pascalTriangleWithTwoTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}, {1, 1}};
        assertThat(PascalTriangle.pascal(2), is(pascalTriangle));
    }
    @Test
    public void pascalTriangleWithThreeTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}, {1, 1}, {1, 2, 1}};
        assertThat(PascalTriangle.pascal(3), is(pascalTriangle));
    }

    @Test
    public void pascalTriangleWithFourTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}};
        assertThat(PascalTriangle.pascal(4), is(pascalTriangle));
    }

    @Test
    public void pascalTriangleWithFiveTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        assertThat(PascalTriangle.pascal(5), is(pascalTriangle));
    }

    @Test
    public void pascalTriangleWithSixTest() throws Exception {
        int[][] pascalTriangle = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}, {1, 5, 10, 10, 5 , 1}};
        assertThat(PascalTriangle.pascal(6), is(pascalTriangle));
    }
}