
public class Transaction {
  private String customerNumber;
  private int transactionType;
  private double amount;
  private String date;
  private String fees;

  public Transaction(String customerNumber, int transactionType, double amount, String fees){
    this.customerNumber = customerNumber;
    this.transactionType = transactionType;
    this.amount = amount;
    this.fees = fees;
  }
  public void processTran(){}
}
