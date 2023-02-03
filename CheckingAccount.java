
public class CheckingAccount extends Account {
  public CheckingAccount(Customer customer){
    super(customer);
  }
  @Override
  public double deposit(double amount) {
  if(amount > 0){
      transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "DEP");
      balance += amount;
      return balance;
    }
    return amount;
  }
  @Override
  public double withdraw(double amount) {
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "CR");
    amount += customer.getCheckCharge();
    if(amount>balance)
      amount += customer.getOverdraftPenalty();
    balance -= amount;
    return balance;
  }
  public double addInterest(){
    double amount;
    amount = balance*customer.getCheckInterest();
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "INT");
    balance += amount;
    return balance;
  }
}





