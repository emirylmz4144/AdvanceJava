package Account;

public class Enterprise extends Account
{

    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addInsurancePolicy()
    {
       int  newInsurancePolicy=0;
        for (int i=0;i<getOurInsurances().stream().count();i++)
        {
           newInsurancePolicy+=getOurInsurances().get(i).getInsurancePrice();
        }
        setInsurancePolicy(newInsurancePolicy*0.9);
    }


}
