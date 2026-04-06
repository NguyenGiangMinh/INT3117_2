import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateElectricityBillDFTest {
    @Test
    void testCase01() {
        double actual = calculateElectricityBill.calculateElectricityBill(0, 0.10, "sinh_hoat");
        assertEquals(-1, actual);
    }

    @Test
    void testCase02() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, -0.05, "sinh_hoat");
        assertEquals(-1, actual);
    }

    @Test
    void testCase03() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.10, "doanh_nghiep");
        assertEquals(-1, actual);
    }

    @Test
    void testCase04() {
        double actual = calculateElectricityBill.calculateElectricityBill(30, 0.10, "sinh_hoat");
        assertEquals(55.37, actual, 0);
    }

    @Test
    void testCase05() {
        double actual = calculateElectricityBill.calculateElectricityBill(100, 0.10, "sinh_hoat");
        assertEquals(207.41, actual, 0);
    }

    @Test
    void testCase06() {
        double actual = calculateElectricityBill.calculateElectricityBill(300, 0.10, "sinh_hoat");
        assertEquals(716.60, actual, 0);
    }

    @Test
    void testCase07() {
        double actual = calculateElectricityBill.calculateElectricityBill(80, 0.10, "kinh_doanh");
        assertEquals(263.82, actual, 0);
    }

    @Test
    void testCase08() {
        double actual = calculateElectricityBill.calculateElectricityBill(200, 0.10, "kinh_doanh");
        assertEquals(710.05, actual, 0);
    }

    @Test
    void testCase09() {
        double actual = calculateElectricityBill.calculateElectricityBill(500, 0.10, "kinh_doanh");
        assertEquals(1907.51, actual, 0);
    }
}
