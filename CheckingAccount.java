/**
 * Created by scruf on 9/14/15.
 */
public class CheckingAccount extends BankAccount {
    public static double BONUS_MONTHLY_RATE = 1.5;
    private boolean bonus;

    CheckingAccount(double newMoney, java.lang.String owner, boolean bonus)
    {
        super(newMoney,owner);
        bonus =false;
    }
    public void calcInterest(){


        double newBalance = super.getCurrentBalance()*(1+((BONUS_MONTHLY_RATE/100)/12));
        double interest = newBalance-super.getCurrentBalance();

        super.setInterest(interest);
        super.getInterest();

    }
    public java.lang.String toString()
    {
        return super.getCurrentBalance()+" "+super.getInterest();
    }
}
