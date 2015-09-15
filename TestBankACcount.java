/**
 * Created by scruf on 9/14/15.
 */
public class TestBankACcount {
    public static void main(java.lang.String []args)
    {

        BankAccount bank = new SavingAccount(5012.50,"Alice Smith");
        for(int i=0;i<3;i++)
        {
            bank.calcInterest();

            bank.printStatement();
            System.out.println();
        }




    }
}
