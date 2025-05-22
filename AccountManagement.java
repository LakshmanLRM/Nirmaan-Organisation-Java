package day14;

import java.util.Scanner;

class Details {
    private int Id;
    private String Name;
    private int Accountno;
    private long balance = 500000000;
    private int pin = 1234;

    public Details(int id, String name, int accountno) {
        this.Id = id;
        this.Name = name;
        this.Accountno = accountno;
    }

    public Details() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAccountno() {
        return Accountno;
    }

    public void setAccountno(int accountno) {
        this.Accountno = accountno;
    }

    public long getBalance() {
        return balance;
    }

    public boolean setBalance(long balance, int pin) {
        if (this.pin == pin) {
            this.balance = balance;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Details [Id=" + Id + ", Name=" + Name + ", Accountno=" + Accountno + ", balance=" + balance + "]";
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        Details D = new Details();
        Scanner sc = new Scanner(System.in);
        boolean checking = true;

        while (checking) {
            System.out.println("Choice is yours: 1.Add 2.Update 3.View 4.Balance Access 5.Exit");
            System.out.print("Enter your choice: ");
            int check = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (check) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account No: ");
                    int acno = sc.nextInt();
                    D = new Details(id, name, acno);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    D.setId(updateId);
                    System.out.print("Enter Name: ");
                    String updateName = sc.nextLine();
                    D.setName(updateName);
                    System.out.print("Enter Account No: ");
                    int updateAcno = sc.nextInt();
                    D.setAccountno(updateAcno);
                    break;

                case 3:
                    System.out.println(D);
                    break;

                case 4:
                    System.out.print("Enter your PIN: ");
                    int pin = sc.nextInt();
                    if (pin == 1234) {
                        System.out.print("Enter new balance amount: ");
                        long amount = sc.nextLong();
                        if (D.setBalance(amount, pin)) {
                            System.out.println("Balance updated successfully.");
                        } else {
                            System.out.println("PIN incorrect. Balance not updated.");
                        }
                    } else {
                        System.out.println("Incorrect PIN.");
                    }
                    break;

                case 5:
                    checking = false;
                    System.out.println("Exiting the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        
    }
}
