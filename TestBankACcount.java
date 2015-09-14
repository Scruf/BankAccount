/**
 * Created by scruf on 9/14/15.
 */
public class TestBankACcount {
    public static void main(java.lang.String []args)
    {

        BankAccount bank = new CheckingAccount(5506.88,"Alice Smith",true);
        for(int i=0;i<3;i++)
        {
            bank.calcInterest();
            System.out.print(bank.toString()+' ');
            bank.printStatement();
            System.out.println();
        }



    }
}
