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
  /**
   * 1. add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"
   * 2. subtract the amount from the balance 
   * 3. add one to the tranIndex 
   *  return the balance 
   */
  @Override
  public double withdraw(double amount) {
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "CR");
    if(amount>balance)
      amount += customer.getOverdraftPenalty();
    balance -= amount;
    return balance;
  }
  /**
   * 1. create an amount from the balance times the customer savings interest
   * 2. add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"
   * 3. add the amount to the balance
   * 4. add one to the tranIndex
   * return the balance
   */
  public double addInterest(){
    double amount;
    amount = balance*customer.getSavingsInterest();
    transactions[tranIndex++] = new Transaction(customer.getCustomerNumber(), 0, amount, "INT");
    balance += amount;
    return balance;
  }
}
