package ObjectOrientedJAVA;

import java.util.Scanner;

public class Banking {
    static Scanner sc=new Scanner(System.in);
     class customer{
        String Name;
        int AmountBalance;
        Long Accountno;

       //constructor
        customer(String Name,int AccountBalance,Long Accountno){
            this.Name=Name;
            this.Accountno=Accountno;
            this.AmountBalance=AccountBalance;

        }
        customer(){

        };
    }



    public void main(String[] args) {

        System.out.println("press 1 for saving customer details");
        System.out.println("press 2 for viewing customer details");
        int check=1;
        if (check == 1) {

            System.out.println("enter the id of the customer:");
            String x = sc.next();
            customer id=new customer();
            System.out.println("Enter the Name of the Customer: ");
            id.Name=sc.next();
            System.out.println("Enter the Account number: ");
            id.Accountno=sc.nextLong();
            System.out.println("Enter the Account Balance: ");
            id.AmountBalance=sc.nextInt();
             check = sc.nextInt();

        }
        if(check==2){

        }
    }

}
