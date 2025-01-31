public class BankAccount {  
    public static void main (String args[])
{
    double balance = 2175.37;
    // initial balance

        balance -= 302.50; // Withdraw $302.50
        balance += 50.03;  // Deposit $50.03
        balance -= balance / 2; // Withdraw half of current balance
        balance += 20.00;  // Deposit $20.00
        balance -= 1.00;   // Withdraw $1.00
        balance *= 2;      // Deposit paycheck that doubles balance
        balance += 1.00;   // Deposit $1.00

   System.out.printf("Bob's final balance: $%.2f%n", balance);
    }
}









