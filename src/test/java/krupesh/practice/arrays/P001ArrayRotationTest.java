package krupesh.practice.arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class P001ArrayRotationTest {
    P001ArrayRotation p001ArrayRotation;

    @Before
    public void setP1_arrayRotation() {
        p001ArrayRotation = new P001ArrayRotation();
    }

    @Test
    public void p001TestArrayRotation1() {
        Integer[] array = new Integer[]{11, 22, 33, 44, 55};
        p001ArrayRotation.rotateArray(array, 2, array.length);
        assertThat(array).isEqualTo(new Integer[]{33, 44, 55, 11, 22});
    }

    @Test
    public void p001TestArrayRotation2() {
        Integer[] array = new Integer[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 110};
        p001ArrayRotation.rotateArray(array, 16, array.length);
        assertThat(array).isEqualTo(new Integer[]{77, 88, 99, 110, 11, 22, 33, 44, 55, 66});
    }

    @Test
    public void p001TestArrayRotation3() {
        Integer[] array = new Integer[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 110};
        p001ArrayRotation.rotateArray(array, 4, array.length);
        assertThat(array).isEqualTo(new Integer[]{55, 66, 77, 88, 99, 110, 11, 22, 33, 44});
    }
}
