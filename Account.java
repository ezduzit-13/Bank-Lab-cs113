
// DONE

abstract class Account {
  protected Customer customer;
  protected double balance;
  protected String accountNumber;
  protected Transaction[] transactions ;
  protected static int accNumber = 0;
  protected int tranIndex;
  public Account(Customer customer){
    this.customer = customer;
    this.balance = 0;
    this.accountNumber = String.format("A%010d",++accNumber);
    this.transactions = new Transaction [20];
    this.tranIndex = 0;
  }
  public double getBalance() {
    return balance;
  }
  public Customer getCustomer() {
    return customer;
  }
  public static int getAccNumber() {
    return accNumber;
  }
  @Override
  public String toString() {
    return "Account: " + accountNumber + "\nOwner: " + customer.getName() + "\nType of Customer: " + customer.getType() + "\nBalance: $" + balance;
  }
  public abstract double deposit(double amount);
  public abstract double withdraw(double amount);
}

