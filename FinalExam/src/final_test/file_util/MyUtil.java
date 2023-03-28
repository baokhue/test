package final_test.file_util;

import final_test.model.DebitAccount;
import final_test.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyUtil {
    public static final String FILE_SAVING = "C:\\Users\\Thu Nguyen\\IdeaProjects\\FinalExam\\src\\final_test\\file\\saving_account.csv";
    public static final String FILE_DEBIT = "C:\\Users\\Thu Nguyen\\IdeaProjects\\FinalExam\\src\\final_test\\file\\bebit_account.csv";

    public static void writeSaving(List<SavingAccount> savingAccountList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_SAVING);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (SavingAccount savingAccount : savingAccountList) {
                buff.write(savingAccount.getInfo() + "\n");
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<SavingAccount> readSaving() {
        List<SavingAccount> savingAccountList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_SAVING);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            SavingAccount savingAccount;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int accountId = Integer.parseInt(temp[0]);
                String accountCode = temp[1];
                String accountName = temp[2];
                String date = temp[3];
                long saving = Long.parseLong(temp[4]);
                String startingDate = temp[5];
                int interest = Integer.parseInt(temp[6]);
                int term = Integer.parseInt(temp[temp.length - 1]);
                savingAccount = new SavingAccount(accountId, accountCode, accountName, date, saving, startingDate, interest, term);
                savingAccountList.add(savingAccount);
            }
            return savingAccountList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeDebit(List<DebitAccount> debitAccountList) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_DEBIT);
            BufferedWriter buff = new BufferedWriter(fileWriter);
            for (DebitAccount debitAccount : debitAccountList) {
                buff.write(debitAccount.getInfo() + "\n");
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<DebitAccount> readDebit() {
        List<DebitAccount> debitAccountList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_DEBIT);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            String[] temp;
            DebitAccount debitAccount;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int accountId = Integer.parseInt(temp[0]);
                String accountCode = temp[1];
                String accountName = temp[2];
                String date = temp[3];
                long cardNumber = Long.parseLong(temp[4]);
                long balance = Long.parseLong(temp[temp.length - 1]);
                debitAccount = new DebitAccount(accountId, accountCode, accountName, date, cardNumber, balance);
                debitAccountList.add(debitAccount);
            }
            return debitAccountList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
