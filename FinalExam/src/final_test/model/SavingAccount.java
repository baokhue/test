package final_test.model;

public class SavingAccount extends BankingAccount {
    private long saving;
    private String startingDate;
    private int interest;
    private int term;

    public SavingAccount() {
    }

    public SavingAccount(int accountId, String accountCode, String accountName, String date, long saving, String startingDate, int interest, int term) {
        super(accountId, accountCode, accountName, date);
        this.saving = saving;
        this.startingDate = startingDate;
        this.interest = interest;
        this.term = term;
    }

    public long getSaving() {
        return saving;
    }

    public void setSaving(long saving) {
        this.saving = saving;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String getInfo() {
        return getFile() + "," + saving + "," + startingDate + "," + interest + "," + term;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                super.toString() +
                "saving=" + saving +
                ", startingDate='" + startingDate + '\'' +
                ", interest=" + interest +
                ", term=" + term +
                '}';
    }

}
