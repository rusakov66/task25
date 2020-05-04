import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class Find_SeqTest {

    @Test
    public void reArray() {
        Find_Seq aa = new Find_Seq();
        Integer arr11[] = {2, 5, 3, 4, 2, 2, 2, 4, 8, 2, 5, 3, 3, 3, 7};
        Integer arr12[] = {2, 2, 2, 2, 2, 3, 3, 3, 7};
        Integer exp1[] = aa.reArray(arr11);

        Integer arr21[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 0, 10};
        Integer arr22[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        Integer exp2[] = aa.reArray(arr21);

        Integer arr31[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 0, 1, 2, 3, 4, 0, 5, 6, 7, 8, 8, 0, 10, 20, 30, 40, 50, 60};
        Integer arr32[] = {0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 20, 30, 40, 50, 60};
        Integer exp3[] = aa.reArray(arr31);

        assertThat(exp1, is(arr12));
        assertThat(exp2, is(arr22));
        assertThat(exp3, is(arr32));

    }
}