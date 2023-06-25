package Insurance;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    double calculate() {
        return 600;
    }
}
