import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateElectricityBillCFTest {
    @Test
    void testCase01() {
        double actual = calculateElectricityBill.calculateElectricityBill(0, 0.1, "sinh_hoat");
        assertEquals(-1, actual);
    }

    @Test
    void testCase02() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.2, "sinh_hoat");
        assertEquals(-1, actual);
    }

    @Test
    void testCase03() {
        double actual = calculateElectricityBill.calculateElectricityBill(50, 0.1, "sinh_hoat");
        assertEquals(92.29, actual, 0);
    }

    @Test
    void testCase04() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.05, "sinh_hoat");
        assertEquals(197.98, actual, 0);
    }

    @Test
    void testCase05() {
        double actual = calculateElectricityBill.calculateElectricityBill(300, 0.05, "sinh_hoat");
        assertEquals(684.02, actual, 0);
    }

    @Test
    void testCase06() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.1, "kinh_doanh");
        assertEquals(329.78, actual, 0);
    }

    @Test
    void testCase07() {
        double actual = calculateElectricityBill.calculateElectricityBill(200, 0.01, "kinh_doanh");
        assertEquals(651.96, actual, 0);
    }

    @Test
    void testCase08() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.14, "kinh_doanh");
        assertEquals(1976.87, actual, 0);
    }

    @Test
    void testCase09() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.1, "khac");
        assertEquals(-1, actual);
    }
}
