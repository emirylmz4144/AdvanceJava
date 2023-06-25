package Insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    double calculate() {
        return 2000;
    }
}
