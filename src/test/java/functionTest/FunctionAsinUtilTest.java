package functionTest;

import static org.junit.Assert.assertEquals;
import static java.lang.Double.NaN;

import function.FunctionAsinUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionAsinUtilTest {

    public final static double PRECISION = 1e-3;

    // для значений y, выходящих за пределы [-1, 1]
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {-2, 2})
    public void testAsinOutOfRange(double val) {
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(NaN, actual, PRECISION);
    }

    // для граничных значений
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {-1, -Math.PI/6, 0, Math.PI/6, 1})
    public void testAsinBorders(double val) {
        double expected = Math.asin(val);
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(expected, actual, PRECISION);
    }

    // для значений x в 1 квадранте
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {-0.875, -0.75, -0.625})
    public void testAsinFirstQuadrant(double val) {
        double expected = Math.asin(val);
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(expected, actual, PRECISION);
    }

    // для значений x во 2 квадранте
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {-0.375, -0.25, -0.125})
    public void testAsinSecondQuadrant(double val) {
        double expected = Math.asin(val);
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(expected, actual, PRECISION);
    }

    // для значений x в 3 квадранте
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {0.125, 0.25, 0.375})
    public void testAsinThirdQuadrant(double val) {
        double expected = Math.asin(val);
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(expected, actual, PRECISION);
    }

    // для значений x в 4 квадранте
    @ParameterizedTest(name = "x={0}")
    @ValueSource(doubles = {0.625, 0.75, 0.875})
    public void testAsinFourthQuadrant(double val) {
        double expected = Math.asin(val);
        double actual = FunctionAsinUtil.asin(val);
        assertEquals(expected, actual, PRECISION);
    }

}
