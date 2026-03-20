public class calculateElectricityBill {
    public static double calculateElectricityBill(int kwh, double tax_rate, String customer_type) {
        double base;
        if (kwh < 1 || kwh > 1000) {
            return -1;
        } else if (tax_rate < 0 || tax_rate > 0.15) {
            return -1;
        } else {
            if (customer_type.equals("sinh_hoat")) {
                if (kwh <= 50) {
                    base = 1.678 * kwh;
                } else if (kwh <= 200) {
                    base = 1.678 * 50 + (kwh - 50) * 2.093;
                } else {
                    base = 50 * 1.678 + 150 * 2.093 + (kwh - 200) * 2.536;
                }
            } else if (customer_type.equals("kinh_doanh")) {
                if (kwh <= 100) {
                    base = kwh * 2.998;
                } else if (kwh <= 400) {
                    base = 100 * 2.998 + (kwh - 100) * 3.457;
                } else {
                    base = 100 * 2.998 + 300 * 3.457 + (kwh - 400) * 3.972;
                }
            } else {
                return -1;
            }
        }
        double total = base * (1 + tax_rate);
        return Math.round(total * 100.0) / 100.0;
    }
}
