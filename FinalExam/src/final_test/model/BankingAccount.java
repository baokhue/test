package final_test.model;

public abstract class BankingAccount {
    private int accountId;
    private String accountCode;
    private String accountName;
    private String date;

    public BankingAccount() {
    }

    public BankingAccount(int accountId, String accountCode, String accountName, String date) {
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.date = date;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public abstract String getInfo();

    public String getFile() {
        return accountId + "," + accountCode + "," + accountName + "," + date;
    }

    @Override
    public String toString() {
        return "BankingAccount{" +
                "accountId=" + accountId +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
