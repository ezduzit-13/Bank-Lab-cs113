public class SavingsAccount extends Account {
  public SavingsAccount(Customer customer){
    super(customer);
  }
  @Override
  public double deposit(double amount) {
  if(amount > 0){
      transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "DEP");
      balance += amount;
      addInterest();
      return balance;
    }
    return amount;
  }
  @Override
  public double withdraw(double amount) {
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "CR");
    if(amount>balance)
      amount += customer.getOverdraftPenalty();
    balance -= amount;
    return balance;
  }
  public double addInterest(){
    double amount;
    amount = balance*customer.getSavingsInterest();
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "INT");
    balance += amount;
    return balance;
  }
}
