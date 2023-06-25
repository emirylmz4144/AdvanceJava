package Insurance;

import java.util.Date;

public  class CarInsurance extends Insurance
{

    public CarInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    double calculate() {
        return 1000;
    }
}
