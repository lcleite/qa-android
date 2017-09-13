package lcleite.github.com.androidqa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leandro on 13/09/17.
 */

public class SumUnitTest{

    private Sum sum;

    @Before
    public void setup(){
        sum = new Sum(1,2);
    }

    @Test
    public void sum_isCorrect() throws Exception {
        assertEquals(3, sum.getValue());
    }
}
