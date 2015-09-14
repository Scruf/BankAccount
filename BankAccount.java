/**
 * Created by scruf on 9/14/15.
 */
  public abstract class BankAccount extends java.lang.Object {

    private double newMoney;
    private java.lang.String ownerName;
    private double interest;
    BankAccount(double newMoney, java.lang.String ownerName){
        this.newMoney = newMoney;
        this.ownerName=ownerName;
    }
        protected void addInterest(double newInterestEarned)
        {
            this.newMoney = this.newMoney + newInterestEarned;
        }
        public abstract  void calcInterest();
        protected void setInterest(double interest)
        {
           this.interest = interest;
        }
       public void printStatement(){

        }
        public double getCurrentBalance()
        {
            return this.newMoney;
        }

        }
