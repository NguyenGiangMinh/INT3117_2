import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateElectricityBillTest {

    @Test
    void testCase01() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.0, "sinh_hoat");
        assertEquals(1158.65, actual, 0);
    }

    @Test
    void testCase02() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.01, "sinh_hoat");
        assertEquals(1170.24, actual, 0);
    }

    @Test
    void testCase03() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.08, "sinh_hoat");
        assertEquals(1251.34, actual, 0);
    }

    @Test
    void testCase04() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.14, "sinh_hoat");
        assertEquals(1320.86, actual, 0);
    }

    @Test
    void testCase05() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.15, "sinh_hoat");
        assertEquals(1332.45, actual, 0);
    }

    @Test
    void testCase06() {
        double actual = calculateElectricityBill.calculateElectricityBill(1, 0.08, "sinh_hoat");
        assertEquals(1.81, actual, 0);
    }

    @Test
    void testCase07() {
        double actual = calculateElectricityBill.calculateElectricityBill(2, 0.08, "sinh_hoat");
        assertEquals(3.62, actual, 0);
    }

    @Test
    void testCase08() {
        double actual = calculateElectricityBill.calculateElectricityBill(999, 0.08, "sinh_hoat");
        assertEquals(2618.04, actual, 0);
    }

    @Test
    void testCase09() {
        double actual = calculateElectricityBill.calculateElectricityBill(1000, 0.08, "sinh_hoat");
        assertEquals(2620.78, actual, 0);
    }

    @Test
    void testCase10() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.08, "kinh_doanh");
        assertEquals(1872.83, actual, 0);
    }

    @Test
    void testCase11() {
        double actual = calculateElectricityBill.calculateElectricityBill(1010, 0.15, "sinh_hoat");
        assertEquals(-1.0, actual);
    }

    @Test
    void testCase12() {
        double actual = calculateElectricityBill.calculateElectricityBill(250, 0.2, "sinh_hoat");
        assertEquals(-1.0, actual);
    }

    @Test
    void testCase13() {
        double actual = calculateElectricityBill.calculateElectricityBill(400, 0.08, "abcd");
        assertEquals(-1.0, actual);
    }

    @Test
    void testCase14() {
        double actual = calculateElectricityBill.calculateElectricityBill(40, 0.01, "sinh_hoat");
        assertEquals(67.79, actual, 0);
    }

    @Test
    void testCase15() {
        double actual = calculateElectricityBill.calculateElectricityBill(150, 0.05, "sinh_hoat");
        assertEquals(307.86, actual, 0);
    }

    @Test
    void testCase16() {
        double actual = calculateElectricityBill.calculateElectricityBill(800, 0.1, "sinh_hoat");
        assertEquals(2111.40, actual, 0);
    }

    @Test
    void testCase17() {
        double actual = calculateElectricityBill.calculateElectricityBill(90, 0.03, "kinh_doanh");
        assertEquals(277.91, actual, 0);
    }

    @Test
    void testCase18() {
        double actual = calculateElectricityBill.calculateElectricityBill(350, 0.06, "kinh_doanh");
        assertEquals(1233.89, actual, 0);
    }

    @Test
    void testCase19() {
        double actual = calculateElectricityBill.calculateElectricityBill(975, 0.14, "kinh_doanh");
        assertEquals(4127.71, actual, 0);
    }
}