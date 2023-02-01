public class Senior extends Customer{
  public double SAVING_INTEREST = 0.04;
  public double CHECK_INTEREST = 0.01;
  public double CHECK_CHARGE = 0.01;
  public double OVERDRAFT_PENALTY = 25;
  public Senior(String cName, String cAddress, 
  int cAge, String cPhoneNumber){
    super(cName, cAddress, cAge, cPhoneNumber);
  }
  public String getType(){
    return "Senior";
  }
  @Override
  public double getSavingsInterest() {
    return SAVING_INTEREST;
  }
  @Override
  public double getCheckInterest() {
    return CHECK_INTEREST;
  }
  @Override
  public double getCheckCharge() {
    return CHECK_CHARGE;
  }
  @Override
  public double getOverdraftPenalty() {
    return OVERDRAFT_PENALTY;
  }  
}
