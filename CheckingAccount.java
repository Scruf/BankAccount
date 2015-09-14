/**
 * Created by scruf on 9/14/15.
 */
public class CheckingAccount extends BankAccount {
    public static double BONUS_MONTHLY_RATE = 1.5;
    private boolean bonus;
    private java.lang.String owner;
    private double newMoney;
    CheckingAccount(double newMoney, java.lang.String owner, boolean bonus)
    {
        super(newMoney,owner);
        this.newMoney=newMoney;
        this.owner = owner;
        bonus =false;
    }
    public void calcInterest(){

        double newBalance = newMoney*(1+((BONUS_MONTHLY_RATE/100)/12));
        double interest = newBalance-newMoney;
        super.setInterest(interest);
    }
}
