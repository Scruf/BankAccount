/**
 * Created by scruf on 9/14/15.
 */
  public abstract class BankAccount extends java.lang.Object {

    public double newMoney;
    public java.lang.String ownerName;
    private double interest;
    BankAccount(double newMoney, java.lang.String ownerName){
        this.newMoney = newMoney;
        this.ownerName=ownerName;
    }
        protected void addInterest(double newInterestEarned)
        {
           /* System.out.print("\t"+newInterestEarned+newMoney);*/
        } 
        public abstract  void calcInterest();
        protected void setInterest(double interest)
        {

           this.interest = interest;
        }
        public double getInterest(){return this.interest;}
       public void printStatement(){

            System.out.print(" "+this.ownerName+"  "+" Interest Earned ");
            System.out.printf("%1.2f", getInterest());
            System.out.print(" Current balance ");
            System.out.printf("%10.2f",getCurrentBalance());


        }
        public double getCurrentBalance()
        {
            return this.newMoney;
        }

        }
