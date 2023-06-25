package Insurance;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    double calculate() {
        return 700;
    }
}
