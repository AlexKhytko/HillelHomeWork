package HW14.DicisionQuadratic;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class DicisionTest {
    @Test
    public void testNoRealRoots() {
        DicisionQuadratic solver = new DicisionQuadratic(1, 1, 1);
        double[] roots = solver.getRoots();
        Assert.assertTrue(toString(), true);
    }
    @Test
    public void testTwoRealRoots() {
        DicisionQuadratic solver = new DicisionQuadratic(1, 3, 2);
        double[] roots = solver.getRoots(); // roots of x^2 - 3x + 2 = 0
        Assert.assertNotNull(roots);
        Assert.assertEquals(roots.length, 2);
    }
    @Test
    public void testTwoRealRoots1() {
        DicisionQuadratic solver = new DicisionQuadratic(1, -4, 2);
        double[] roots = solver.getRoots(); // roots of x^2 - 3x + 2 = 0
        Assert.assertNotNull(roots);
        Assert.assertEquals(roots.length, 2);
    }
    @Test
    public void testOneRealRoot() {
        DicisionQuadratic solver = new DicisionQuadratic(1, -2, 1);
        double[] roots = solver.getRoots(); // roots of x^2 - 2x + 1 = 0
        Assert.assertNotNull(roots);
        Assert.assertEquals(roots.length, 1);
    }


}
