/**
 * Created by Egor Aliaksander Kozitski on 9/14/15.
 */

/*
* @param SAVINGS_ACCOUNT The account type for this account
* @param SAVINGS_MONTHLY_INTEREST_RATE The annual interest rate for a standard savings account is currently 0.3%.
* */
public class SavingAccount extends BankAccount {
    private java.lang.String SAVING_ACCOUNT ="SA";
    public double SAVINGS_MONTHLY_INTEREST_RATE=0.3;
    /*
    * SavingAccount constructor accept newMone and ownerName as its parameters
    * */
        SavingAccount(double newMoney, java.lang.String ownerName)
        {
            super(newMoney,ownerName);

        }
    /*
    * method calcInterest
    * calculate the annual interest for a Saving account
    * */
    public void calcInterest()
    {

        double newBalance = super.getCurrentBalance()*(1+((SAVINGS_MONTHLY_INTEREST_RATE/100)/12));
        double interest = newBalance-super.getCurrentBalance();
        super.setInterest(interest);
        super.newMoney=newBalance;
    }
    /*
    * getAccount method
    * return the account type
    * */
    public java.lang.String getAccountType()
    {
        return SAVING_ACCOUNT;
    }
    /*
    * toString method
    * will return a printable version of the account
    * */
    public java.lang.String toString()
    {
        return getAccountType()+" "+this.ownerName+" "+this.newMoney;
    }
}

