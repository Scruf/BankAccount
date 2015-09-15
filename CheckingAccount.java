/**
 * Created by scruf on 9/14/15.
 */
public class CheckingAccount extends BankAccount {
    public static double BONUS_MONTHLY_RATE = 0.1;
    private boolean bonus;
    private static double PREMIUM_CHECKING_MINIMUM_BALANCE=500;
    public java.lang.String CHECKING_ACCOUNT = "CICN";

    CheckingAccount(double newMoney, java.lang.String owner, boolean bonus)
    {
        super(newMoney, owner);
        this.bonus=bonus;
        if(this.bonus)
            this.CHECKING_ACCOUNT=CHECKING_ACCOUNT.substring(0,2);
        else
            this.CHECKING_ACCOUNT=CHECKING_ACCOUNT.substring(2,4);
        System.out.print(getAccountType());

    }
    public void calcInterest(){

            if(bonus && super.getCurrentBalance()> PREMIUM_CHECKING_MINIMUM_BALANCE)
            {

                double newBalance = super.getCurrentBalance()*(1+((BONUS_MONTHLY_RATE/100)/12));
                double interest = newBalance-super.getCurrentBalance();
                super.setInterest(interest);
                super.newMoney=newBalance;
            }





    }
    public java.lang.String getAccountType(){
            return CHECKING_ACCOUNT;
    }
    public java.lang.String toString()
    {
        return this.newMoney+" "+super.ownerName+" ";
    }

}
