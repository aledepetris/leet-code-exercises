import com.aledepetris.roadmap.algomap.stringsarrays.ClosestNumberToZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class TestFindClosestNumber {

    private ClosestNumberToZero closestNumberToZero;

    @BeforeEach
    public void setUp() {
        closestNumberToZero = new ClosestNumberToZero();
    }

    @Test
    void findClosestNumberToZero() {

        int [] numbers = {-5555,-30,-1,2,5,7,1523};
        int result = closestNumberToZero.findClosestNumber(numbers);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void findClosestNumberToWithEqualDistance() {

        int [] numbers = {1,-1,2,5,7};
        int result = closestNumberToZero.findClosestNumber(numbers);
        assertThat(result).isEqualTo(1);
    }

}
