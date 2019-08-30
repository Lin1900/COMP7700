/**
 * @author Linyuan Zhang
 * @version 08/27/2019
 * Comp7700 Assignment2
 */

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class firstTest {
    @Before
    public void setUp() {
    }

    /** A test for the valid array. **/
    @Test public void validTest() {
        FindMinMax find = new FindMinMax();
        int[] newArray = {8, 5, 10, 3, 2, -1, 4};
        int max = find.findMax(newArray);
        int min = find.findMin(newArray);
        Assert.assertEquals("Valid Test for maximum", max, 10);
        Assert.assertEquals("Valid Test for minimum", min, -1);
    }

    /** First test for the null array. **/
    @Test public void nullTest() {
        FindMinMax find = new FindMinMax();
        int[] newArray = null;
        Integer max = find.findMax(newArray);
        Integer min = find.findMin(newArray);
        Assert.assertTrue("Valid Test for maximum", max == null);
        Assert.assertTrue("Valid Test for maximum", min == null);
    }

    /** First test for the empty array. **/
    @Test public void emptyTest() {
        FindMinMax find = new FindMinMax();
        int[] newArray = {};
        Integer max = find.findMax(newArray);
        Integer min = find.findMin(newArray);
        Assert.assertTrue("Valid Test for maximum", max == null);
        Assert.assertTrue("Valid Test for maximum", min == null);
    }


}
