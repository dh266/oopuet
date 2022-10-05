import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        }
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        }
    }

    /**
     * Add a transaction to the list of transactions.
     * @param amount - So tien nap hoac rut
     * @param operaion - Selection : deposit or deposit
     */
    public void addTransaction(double amount, String operaion) {
        if (operaion != "deposit" && operaion != "withdraw") {
            System.out.println("Yeu cau khong hop le!");
        }
        Transaction transactionA = new Transaction(operaion, amount, this.balance);
        if (operaion == "deposit") {
            deposit(amount);
            transactionA.setBalance(this.balance + amount);
            this.balance += amount;
        }
        if (operaion == "withdraw") {
            withdraw(amount);
            transactionA.setBalance(this.balance - amount);
            this.balance -= amount;
        }
        this.transitionList.add(transactionA);
    }

    /**
     * Standard export information about,
     * all transactions of each account.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            if (transitionList.get(i).getOperation() == "deposit") {
                System.out.printf(
                        "Giao dich %s: Nap tien $%.2f. So du luc nay: $%.2f.\n",
                        i + 1, transitionList.get(i).getAmount(),
                        transitionList.get(i).getBalance());
            }
            if (transitionList.get(i).getOperation() == "withdraw") {
                System.out.printf(
                        "Giao dich %s: Rut tien $%.2f. So du luc nay: $%.2f.\n",
                        i + 1, transitionList.get(i).getAmount(),
                        transitionList.get(i).getBalance());
            }
        }
    }
}
