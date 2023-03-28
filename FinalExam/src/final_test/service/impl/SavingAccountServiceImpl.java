package final_test.service.impl;

import final_test.exception.NotFoundBankAccountException;
import final_test.file_util.MyUtil;
import final_test.model.SavingAccount;
import final_test.service.SavingAccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavingAccountServiceImpl implements SavingAccountService {
    static List<SavingAccount> savingAccountList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        SavingAccount savingAccount1 = new SavingAccount(1, "S12", "Khue", "17/12/2022", 500000, "17/11/2022", 0, 5);
        savingAccountList.add(savingAccount1);
        MyUtil.writeSaving(savingAccountList);
    }

    public void addSaving() {
        savingAccountList = MyUtil.readSaving();
        int accountId = savingAccountList.size() + 1;
        System.out.println("---Adding new Saving account.---");
        System.out.println("2. Account Code: ");
        String accountCode = scanner.nextLine();
        System.out.println("3. Account Owner's name: ");
        String ownerName = scanner.nextLine();
        System.out.println("4. Sign up account on date: ");
        String date = scanner.nextLine();
        System.out.println("5. The number of cash to save: ");
        long saving = Long.parseLong(scanner.nextLine());
        System.out.println("6. The date of saving: ");
        String startingDate = scanner.nextLine();
        System.out.println("7. Lai suat: ");
        int laiSuat = Integer.parseInt(scanner.nextLine());
        System.out.println("8. Ki han (month): ");
        int kiHan = Integer.parseInt(scanner.nextLine());

        SavingAccount savingAccount = new SavingAccount(accountId, accountCode, ownerName, date, saving, startingDate, laiSuat, kiHan);
        addNew(savingAccount);
        MyUtil.writeSaving(savingAccountList);
    }

    public void removeSaving() {
        savingAccountList = MyUtil.readSaving();
        System.out.println("Please input account code (Saving): ");
        String delCode = scanner.nextLine();
        int delSelect = 0;
        try {
            for (int i = 0; i < savingAccountList.size(); i++) {
                if (delCode.equals(savingAccountList.get(i).getAccountCode())) {
                    do {
                        System.out.println("1. Yes!");
                        System.out.println("2. No!");

                        System.out.println("Input a number: ");
                        delSelect = Integer.parseInt(scanner.nextLine());
                        switch (delSelect) {
                            case 1:
                                savingAccountList.remove(savingAccountList.get(i));
                                MyUtil.writeSaving(savingAccountList);
                                System.out.println("Deleted!");
                                break;
                            case 2:
                                break;
                        }
                        break;
                    } while (true);
                } else {
                    throw new NotFoundBankAccountException();
                }
                break;
            }
        } catch (NotFoundBankAccountException e){
            System.out.println("This account not exist (Saving)!");
        }
    }

    public void displaySavingList(){
        savingAccountList = MyUtil.readSaving();
        for (SavingAccount savingAccount : savingAccountList) {
            System.out.println(savingAccount);
        }
    }

    public void searchSaving(){
        savingAccountList = MyUtil.readSaving();
        int searchingSelect= 0;
        do {
            System.out.println("Please input Account code or Owner's name: ");
            searchingSelect = Integer.parseInt(scanner.nextLine());

            switch (searchingSelect){
                case 1:
                    System.out.println("Please in put Account code: ");
                    String searchingCode = scanner.nextLine();

                    for (int i = 0; i < savingAccountList.size(); i++) {
                        if (searchingCode.equals(savingAccountList.get(i).getAccountCode())){
                            System.out.println(savingAccountList.get(i));
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please in put Owner's name: ");
                    String searchingName = scanner.nextLine();

                    for (int i = 0; i < savingAccountList.size(); i++) {
                        if (searchingName.equals(savingAccountList.get(i).getAccountName())){
                            System.out.println(savingAccountList.get(i));
                            break;
                        }
                    }
                    break;
            }
            break;
        }while (true);
    }

    @Override
    public void addNew(SavingAccount savingAccount) {
        savingAccountList.add(savingAccount);
    }
}
