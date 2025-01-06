// package Day_3_Inheritance;

class Account {

    int AccountNo;

    int balance;

    String IFSC_code;

    Account(int AccountNo, int balance, String IFSC_code) {

        this.AccountNo = AccountNo;

        this.balance = balance;

        this.IFSC_code = IFSC_code;

    }

}

class SavingAccount extends Account {

    int ROI;

    int Min_Bal;

    SavingAccount(int AccountNo, int balance, String IFSC_code, int ROI,
            int Min_Bal) {

        super(AccountNo, balance, IFSC_code);

        this.ROI = ROI;

        this.Min_Bal = Min_Bal;

    }

    void display() {

        System.out.println(AccountNo + " " + balance + " " + IFSC_code + " " + ROI + " " + Min_Bal);

    }

}

public class Task {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        SavingAccount sav = new SavingAccount(2984, 22000, "SBI0000321", 3, 5000);

        sav.display();

    }

}
