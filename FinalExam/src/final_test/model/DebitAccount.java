package final_test.model;

public class DebitAccount extends BankingAccount {
    private long cardNumber;
    private long balance;

    public DebitAccount() {
    }

    public DebitAccount(int accountId, String accountCode, String accountName, String date, long cardNumber, long balance) {
        super(accountId, accountCode, accountName, date);
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String getInfo() {
        return getFile() + "," + cardNumber + "," + balance;
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                super.toString() +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                '}';
    }

}
