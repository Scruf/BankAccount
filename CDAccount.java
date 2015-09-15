/**
 * Created by scruf on 9/14/15.
 */
public class CDAccount extends BankAccount {
    /*
    * @param CD_ACCOUNT The account type for this account
    * @param MINIMUM_BALANCE  The minimum amount that must be kept in the account at all times; interest is earned only on the amount over the minimum - currently $1000.
    * @param MONTHLY_INTEREST_RATE The annual interest rate for balances greater than the minimum - currently 0.6%.
    * */
    private java.lang.String CD_ACCOUNT = "CD";
    private static double MINIMUM_BALANCE = 1000;
    private static double MONTHLY_INTEREST_RATE=0.6;
    public CDAccount(double newMoney,java.lang.String ownerName)
    {
        super(newMoney,ownerName);
    }
    /*
    * method calcInterest ()Calculate the interest and update the balance for this account.
    * */
    public void calcInterest()
    {
        if (super.getCurrentBalance()>1000)
        {
            double difference = super.getCurrentBalance()-MINIMUM_BALANCE;
            double interest = difference*(1+((MONTHLY_INTEREST_RATE/100)/12));
            double temp = interest-(super.getCurrentBalance()-MINIMUM_BALANCE);
            super.setInterest(temp);
            super.newMoney =  super.getCurrentBalance()+temp;
        }
    }
    /*
    * getAccountType() The account type designation for this account.
    * */
    public java.lang.String getAccountType()
    {
        return CD_ACCOUNT;
    }
    /*
    * toString() displaying what kind of account is that
    * */
    public  java.lang.String toString()
    {
        return getAccountType()+" "+this.ownerName+" "+this.newMoney;
    }
}
