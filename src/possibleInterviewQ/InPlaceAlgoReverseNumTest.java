package possibleInterviewQ;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InPlaceAlgoReverseNumTest {
    void givenArray_whenInplaceSort_thenReverse() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        assertArrayEquals(expected, InPlaceAlgoReverseNum.reverseInPlace(input));
    }
}
