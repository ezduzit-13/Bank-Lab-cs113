
/**
 * !Array Index out of bounds exception
 * A0000000001
 */

public class BankApp {
  public static void main(String[] args) {
    Bank bank = new Bank();
    BankGUI gui = new BankGUI();
    gui.processCommands(bank);
  }
  
}
