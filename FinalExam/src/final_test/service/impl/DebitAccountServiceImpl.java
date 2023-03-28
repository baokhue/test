package final_test.service.impl;

import final_test.exception.NotFoundBankAccountException;
import final_test.file_util.MyUtil;
import final_test.model.DebitAccount;
import final_test.service.DebitAccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DebitAccountServiceImpl implements DebitAccountService {
    static List <DebitAccount> debitAccountList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        DebitAccount debitAccount1 = new DebitAccount(1, "D23", "Khue", "17/11/2021", 74098321, 7000);
        debitAccountList.add(debitAccount1);
        MyUtil.writeDebit(debitAccountList);
    }

    public void addDebit(){
        debitAccountList = MyUtil.readDebit();
        int accountId = debitAccountList.size() + 1;
        System.out.println("---Adding new Debit account.---");
        System.out.println("2. Account Code: ");
        String accountCode = scanner.nextLine();
        System.out.println("3. Account Owner's name: ");
        String ownerName = scanner.nextLine();
        System.out.println("4. Sign up account on date: ");
        String date = scanner.nextLine();
        System.out.println("5. Card number: ");
        long cardNumber = Long.parseLong(scanner.nextLine());
        System.out.println("6. The number of budget in account: ");
        long budget = Long.parseLong(scanner.nextLine());

        DebitAccount debitAccount = new DebitAccount(accountId, accountCode, ownerName, date, cardNumber, budget);
        addNew(debitAccount);
        MyUtil.writeDebit(debitAccountList);
    }

    public void remove() throws NotFoundBankAccountException {
        debitAccountList = MyUtil.readDebit();
        System.out.println("Please input account code(Debit): ");
        String delCode = scanner.nextLine();
        int delSelect = 0;

        for (int i = 0; i < debitAccountList.size(); i++) {
            try {
                if (delCode.equals(debitAccountList.get(i).getAccountCode())){
                    do {
                        System.out.println("1. Yes!");
                        System.out.println("2. No!");

                        System.out.println("Input a number: ");
                        delSelect = Integer.parseInt(scanner.nextLine());
                        switch (delSelect){
                            case 1:
                                debitAccountList.remove(debitAccountList.get(i));
                                MyUtil.writeDebit(debitAccountList);
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
            } catch (NotFoundBankAccountException e){
                System.out.println("This account not exist (Debit)!");
            }
        }
    }

    public void displayList(){
        debitAccountList = MyUtil.readDebit();
        for (DebitAccount debitAccount : debitAccountList) {
            System.out.println(debitAccount);
        }
    }

    public void searchDebit(){
        debitAccountList = MyUtil.readDebit();
        int searchingSelect;
        do {
            System.out.println("Please input Account code or Owner's name: ");
            searchingSelect = Integer.parseInt(scanner.nextLine());

            switch (searchingSelect){
                case 1:
                    System.out.println("Please in put Account code: ");
                    String searchingCode = scanner.nextLine();

                    for (int i = 0; i < debitAccountList.size(); i++) {
                        if (searchingCode.equals(debitAccountList.get(i).getAccountCode())){
                            System.out.println(debitAccountList.get(i));
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Please in put Owner's name: ");
                    String searchingName = scanner.nextLine();

                    for (int i = 0; i < debitAccountList.size(); i++) {
                        if (searchingName.equals(debitAccountList.get(i).getAccountName())){
                            System.out.println(debitAccountList.get(i));
                            break;
                        }
                    }
                    break;
            }
            break;
        }while (true);


    }
    @Override
    public void addNew(DebitAccount debitAccount) {
        debitAccountList.add(debitAccount);
    }

}
