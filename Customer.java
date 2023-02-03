
abstract class Customer{
  private String name;
  private String address;
  private int age;
  private String telephoneNumber;
  private String customerNumber;
  static protected int custNumber = 0;
  public Customer(String cName,String cAddress, int cAge, String cTelephone){
    this.name = cName;
    this.address = cAddress;
    this.age = cAge;
    this.telephoneNumber = cTelephone;
    this.customerNumber = String.format("%010d",++custNumber);
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getTelephoneNumber() {
    return telephoneNumber;
  }
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }
  public String getCustomerNumber() {
    return customerNumber;
  }
  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }
  public abstract String getType();
  public abstract double getSavingsInterest();
  public abstract double getCheckInterest();
  public abstract double getCheckCharge();
  public abstract double getOverdraftPenalty();
}