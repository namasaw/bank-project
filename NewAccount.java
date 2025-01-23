import java.util.Scanner;

public class NewAccount {

  String accName;
  long accNo;
  int balance;

  public NewAccount(String accName, long accNo, int balance) {
    this.accName = accName;
    this.accNo = accNo;
    this.balance = balance;
  }

  public static void main(String[] args) {
    NewAccount acc = null;
    Scanner write=new  Scanner(System.in);
      
    
      System.out.println("1.create account");
      System.out.println("2.Deposit ");
      System.out.println("3.withdraw");
      System.out.println("4.getDetails");

      System.out.println("select option");
      int opt=write.nextInt();
      switch (opt) {

        
        case 1://create account
          
          break;
          case 2://deposit
           
           

          break;
          case 3: //withdraw


          break;
          case 4://get details

          break;
        default:
          break;
      }


    }
  }


