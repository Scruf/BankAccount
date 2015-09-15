/**
 * Created by Egor Aliaksander Kozitski on 9/14/15.
 */

/*
* @param BONUS_MONTHLY_RATE The interest rate for a bonus account - currently 0.1% per year
* @param CHECKING_ACCOUNT The account type for this account ("CI" for interest bearing or "CN" for non-interest bearing), set in the constructor.
* @param PREMIUM_CHECKING_MINIMUM_BALANCE The minimum balance to earn interest - currently $500.
* */
public class CheckingAccount extends BankAccount {
    public static double BONUS_MONTHLY_RATE = 0.1;
    private boolean bonus;
    private static double PREMIUM_CHECKING_MINIMUM_BALANCE=500;
    public java.lang.String CHECKING_ACCOUNT = "CICN";
/*
* CheckingAccount  A constructor for a CheckingAccount object.
* A constructor for a CheckingAccount object. It accepts the amount of money deposited when the account is created.
* */
    CheckingAccount(double newMoney, java.lang.String owner, boolean bonus)
    {
        super(newMoney, owner);
        this.bonus=bonus;
        if(this.bonus)
            this.CHECKING_ACCOUNT=CHECKING_ACCOUNT.substring(0,2);
        else
            this.CHECKING_ACCOUNT=CHECKING_ACCOUNT.substring(2,4);
      /*  System.out.print(getAccountType());*/

    }
    /*
    * method calcInterest Calculate the interest and update the balance for this account.
    * */
    public void calcInterest(){

            if(bonus && super.getCurrentBalance()> PREMIUM_CHECKING_MINIMUM_BALANCE)
            {

                double newBalance = super.getCurrentBalance()*(1+((BONUS_MONTHLY_RATE/100)/12));
                double interest = newBalance-super.getCurrentBalance();
                super.setInterest(interest);
                super.newMoney=newBalance;
            }
    }
    /*
    *   getAccountType() method
    * return then account type of the account
    * */
    public java.lang.String getAccountType(){
            return CHECKING_ACCOUNT;
    }
    /*
    *   toString() method
    * return the printable of the account
    * */
    public java.lang.String toString()
    {
        return getAccountType()+" "+this.ownerName+" "+this.newMoney;
    }

}
