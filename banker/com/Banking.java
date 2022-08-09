package banker.com;

import java.math.BigDecimal;
import java.util.*;

public class Banking {
    //Method Deposit
       // public void deposite(int amount) {
         //   System.out.println("Enter the amount you want to deposit:");
           // amount = scan.nextBigDecimal();
        //}


        public static void main(String[] args) {
            System.out.println("WELCOME TO IDCIAN BANK");
            System.out.println("Enter Your Choice:");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();

            //Define balance
           BigDecimal Balance = BigDecimal.valueOf(2000);

           //account opening method call
            BankingRunner DA = new BankingRunner();
            DA.openAcc();

            switch(ch)
            {
                case 1:
                    System.out.println("Deposit Amount & ");
                    DA.Deposite();
                    break;

                case 2:
                    System.out.println("Withdrawal  the Amount & ");
                     DA.Withdraw();
                     break;
                case 3:
                    System.out.println("Check Balance:");
                    //DA.getBalance();
                    break;
                case 4:
                    System.out.println("Exit:");
                    break;
            }
        }


    }

