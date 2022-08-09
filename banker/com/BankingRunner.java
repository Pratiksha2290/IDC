package banker.com;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class BankingRunner {

    private BigDecimal Acc_no;
    private String name;
    private String Acc_type;
    private BigDecimal Balance;

    Scanner scan = new Scanner(System.in);

    ArrayList<long> accNo = new ArrayList<long>(
            Arrays.asList(102453642,
                    124626355,
                    1257896256));


    public void openAcc() {
        System.out.print("Enter Account no:");
        Acc_no = scan.nextBigDecimal();
        System.out.print("Enter Account Type:");
        Acc_type = scan.next();
        System.out.print("Enter User Name:");
        name = scan.next();
        System.out.print("Enter balance:");
        Balance = scan.nextBigDecimal();
    }

    public void showAccount() {
        System.out.println("Name of account holder:" + name);
        System.out.println("Account no:" + Acc_no);
        System.out.println("Account type: " + Acc_type);
        System.out.println("Balance: " + Balance);
    }

    // Deposite Money
    public void Deposite() {
        BigDecimal amt;
        System.out.println("Enter the amount you want to Deposite:");
        amt = scan.nextBigDecimal();
        Balance = Balance.add(amt);
        System.out.print( "Available Balance: ");
        System.out.println(Balance);


    }

    //Withdraw Money
    public BigDecimal Withdraw() {
        BigDecimal amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = scan.nextBigDecimal();
        BigDecimal with = Balance.min(amt);
        System.out.println("balance after withdraw:" + with);
        BigDecimal withd = Balance.min(amt);
        System.out.println("Your Balance less than" + withd + " Transcation failed");
        return amt;
    }

  /*  public BigDecimal getBalance(BigDecimal b) {
        Balance = b;
        return Balance;
    }*/

    public void getBalance(BigDecimal b) {
        Balance = b;
        //return Balance;
    }

    /* public void deposite(int amount) {
         System.out.println("Enter the amount you want to deposit:");
         amount = sc.nextBigDecimal();


    }*/






}
