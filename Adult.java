public class Adult extends Customer{
  public static final double SAVING_INTEREST = 0.03;
  public static final double CHECK_INTEREST = 0.01;
  public static final double CHECK_CHARGE = 0.03;
  public static final double OVERDRAFT_PENALTY = 25;
  public Adult(String cName, String cAddress, 
  int cAge, String cPhoneNumber){
    super(cName, cAddress, cAge, cPhoneNumber);
  }
  public String getType(){
    return "Adult";
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
