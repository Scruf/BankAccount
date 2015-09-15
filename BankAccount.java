/**
 * Created by Egor Aliaksander Kozitski on 9/14/15.
 */
  public abstract class BankAccount extends java.lang.Object {
    /*
    *@param newMoney a palceholder for a persons balance
    *@param ownerName a placehodler for a persons name
    * @param interest a placeholder for a person interest
    * */
    public double newMoney;
    public java.lang.String ownerName;
    private double interest;
    /*
    * BankAccount constructor will accept two arguments
    * @newMoney as a persons balance
    * @ownerName  as a persons name
    * */
    BankAccount(double newMoney, java.lang.String ownerName){
        this.newMoney = newMoney;
        this.ownerName=ownerName;
    }
    public abstract  java.lang.String getAccountType();
        protected void addInterest(double newInterestEarned)
        {
           /* System.out.print("\t"+newInterestEarned+newMoney);*/
        }
    /*
    *   abstract method which will be implemented
    *   in all accounts
    * */
        public abstract  void calcInterest();
    /*
    * setInterest method
    * wil set the interest after the interest is calculated
    * */
        protected void setInterest(double interest)
        {

           this.interest = interest;
        }
    /*
    * getInterest method will return the interest
    * */
        public double getInterest(){return this.interest;}
    /*
    * printStatement method
    * will print the persons information
    *
    * */
       public void printStatement(){

            System.out.print(" "+this.ownerName+"  "+" Interest Earned\t ");
            System.out.printf("%1.2f\t", getInterest());
            System.out.print(" Current balance ");
            System.out.printf("%10.2f",getCurrentBalance());


        }
    /*getCurrentBalance method
    * will return the balance for the account
    * */
        public double getCurrentBalance()
        {
            return this.newMoney;
        }

        }
