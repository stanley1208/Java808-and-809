
public class CheckingAccount {
public int amount;
public CheckingAccount(int amount){
this.amount = amount;
}
public int getAmount(){ return amount; }
public void setAmount(int amount){ this.amount = amount; }
public void changeAmount(int x){
amount += x;
}
public static void main(String[] args) {
CheckingAccount acct = new CheckingAccount((int) (Math.random()*1000));
//acct.getAmount();
//this.amount = 0;
//acct.amount = 0;
//acct.changeAmount(-acct.amount);
//acct.getAmount() = 0;
//acct.changeAmount(0);
acct.setAmount(0);
System.out.println(acct.getAmount());
}
}
