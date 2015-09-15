/**
 * Created by Egor Aliaksander Kozitski on 9/14/15.
 */
import java.util.*;
public class TestBankACcount {
    public static void main(java.lang.String[] args) {
        /*
        * @param accounts will hold all accounts
        * @param totalBalance is a variable which will be incremented and will hold a total value of all accounts
        * @param totalInterest is a variable which will be incremented and will hold a toal value of all iterests
        * */
        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new CDAccount(11150, "Andy Anderson"));
        accounts.add(new CheckingAccount(64665.75, "Sharon Smith", false));
        accounts.add(new CDAccount(10000, "Phil Phillips"));
        accounts.add(new CheckingAccount(450, "Carol Carroll", true));
        accounts.add(new SavingAccount(5000, "Bill Baley"));
        accounts.add(new CheckingAccount(5500, "Lois Lane", true));
        double totalBalances = 0;
        double totalInterest = 0;
        /*
        * for loop will iterate 4 times and
        * for loop inside another for loop will iterate over all accounts and execute calcInterest method which will calculate the interest
        *   for all accounts
        * */
        for (int i = 0; i < 4; i++) {
            for (BankAccount a : accounts) {
                a.calcInterest();

                totalInterest += a.getInterest();
                System.out.print(a.getAccountType());
                a.printStatement();
                System.out.println();

            }
            System.out.println();
            System.out.print("----------------------------------------------");
            System.out.println();
        }

        System.out.println();
        /*
        * Displaying the total interest
        * Displaying the total balances
        * */
        for (BankAccount a : accounts)
            totalBalances+=a.getCurrentBalance();
        System.out.printf("Total interest:\t" + "%1.2f", totalInterest);
        System.out.printf("\nTotal balances:\t" + "%1.2f", totalBalances);

    }

}

