package Class15_OOP_InnerClasses;

/**
 * Created by UITS-Admin on 03.03.2019.
 */
public class Bank {
    private String title  = null;

    public Bank(String title) {
        this.title = title;
    }

    public class Account {
         int number = 0;
         double balance = 0;

        public Account(int number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        void show() {
            System.out.printf("Bank - %s, account number - %d, balance - %g", title,number, balance);
        }

        double setMoney(double money) {

            if (money > 0) {

              balance += money;

            } else
                System.out.println("You can't set money!!!");
            return  money;
        }

        double getMoney(double money) {
            if (money < balance) {

                balance -= money;
            } else
                System.out.println("You can't get money!!!");
            return  money;
        }

    }
}
