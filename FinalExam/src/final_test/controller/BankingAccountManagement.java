package final_test.controller;

import final_test.exception.NotFoundBankAccountException;
import final_test.service.impl.DebitAccountServiceImpl;
import final_test.service.impl.SavingAccountServiceImpl;

import java.util.Scanner;

public class BankingAccountManagement {
    public static void displayMenu() throws NotFoundBankAccountException {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("---Managing Banking Account Programme---");
            System.out.println("Choose a feature by number (to continue): ");
            System.out.println("1. Add new.");
            System.out.println("2. Delete.");
            System.out.println("3. Display Banking accounts list.");
            System.out.println("4. Search.");
            System.out.println("5. Exit.");

            System.out.println("Please choose a feature1: ");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1: //Add
                    System.out.println("---Adding new Banking account.---");
                    System.out.println("Choose type of Banking account you want to add.");
                    System.out.println("1. Saving Account.");
                    System.out.println("2. Debit Account.");

                    System.out.println("Input a number: ");
                    select = Integer.parseInt(scanner.nextLine());
                    switch (select) {
                        case 1: //Saving
                            SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();
                            savingAccountService.addSaving();
                            break;
                        case 2: //Debit
                            DebitAccountServiceImpl debitAccountService = new DebitAccountServiceImpl();
                            debitAccountService.addDebit();
                            break;
                    }
                    break;
                case 2: //Delete
                    SavingAccountServiceImpl savingAccountService = new SavingAccountServiceImpl();
                    savingAccountService.removeSaving();

                    DebitAccountServiceImpl debitAccountService1 = new DebitAccountServiceImpl();
                    debitAccountService1.remove();
                    break;
                case 3: //Display
                    SavingAccountServiceImpl savingAccountService1 = new SavingAccountServiceImpl();
                    savingAccountService1.displaySavingList();

                    DebitAccountServiceImpl debitAccountService2 = new DebitAccountServiceImpl();
                    debitAccountService2.displayList();
                    break;
                case 4: //Search
                    SavingAccountServiceImpl savingAccountService2 = new SavingAccountServiceImpl();
                    savingAccountService2.searchSaving();

                    DebitAccountServiceImpl debitAccountService3 = new DebitAccountServiceImpl();
                    debitAccountService3.searchDebit();
                    break;
                case 5: //Exit
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) throws NotFoundBankAccountException {
        displayMenu();
    }
}
