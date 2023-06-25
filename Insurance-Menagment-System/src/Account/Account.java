package Account;

import Address.AddresMenager;
import Address.Address;
import Insurance.Insurance;

import java.util.*;

public abstract class Account
{
    private User user;
    private double insurancePolicy;
   private List<Insurance> ourInsurances;

    public Account(User user)
    {
        this.user=user;
        insurancePolicy=0;
    }

    public void addAddress()
    {
        Address address=AddresMenager.addAddress();
        user.ourAddresses.add(address);
        ourInsurances=new ArrayList<Insurance>();
    }
    public void deleteAddress()
    {
        Address address=AddresMenager.deleteAddress();

        Iterator<Address> iterator=user.getOurAddresses().iterator();

        while (iterator.hasNext())
        {
            Address addressForDelete=iterator.next();
            if (addressForDelete.toString().equals(address.toString()))
            {
                iterator.remove();
                System.out.println("Adres başarı ile silindi");
            }
        }
    }
    public abstract void addInsurancePolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(double insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public List<Insurance> getOurInsurances() {
        return ourInsurances;
    }

    public void setOurInsurances(List<Insurance> ourInsurances) {
        this.ourInsurances = ourInsurances;
    }
}
