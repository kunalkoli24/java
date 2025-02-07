import java.util.Scanner;

public class plant_bank {
        static String[] customerIDs = new String[10];
        static String[] customerNames = new String[10];
        static String[] accountStatuses = new String[10];
        static String[] accountTypes = new String[10];
        static double[] balances = new double[10];
        static int numAccounts = 0;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Welcome to the bank. Please select an option:");
                System.out.println("1. Login");
                System.out.println("2. Create an account");
                System.out.println("3. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        login(scanner);
                        break;
                    case 2:
                        createAccount(scanner);
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        public static void login(Scanner scanner) {
            System.out.print("Enter your customer ID: ");
            String customerID = scanner.next();

            int index = findCustomerIndex(customerID);

            if (index == -1) {
                System.out.println("Customer not found.");
                return;
            }

            System.out.println("Welcome, " + customerNames[index] + "!");

            while (true) {
                System.out.println("Please select an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Transfer");
                System.out.println("4. Account details");
                System.out.println("5. Logout");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        deposit(scanner, index);
                        break;
                    case 2:
                        withdraw(scanner, index);
                        break;
                    case 3:
                        transfer(scanner, index);
                        break;
                    case 4:
                        displayAccountDetails(index);
                        break;
                    case 5:
                        System.out.println("Logged out.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        public static void createAccount(Scanner scanner) {
            if (numAccounts >= 10) {
                System.out.println("Cannot create any more accounts.");
                return;
            }

            System.out.print("Enter customer ID: ");
            String customerID = scanner.next();

            if (findCustomerIndex(customerID) != -1) {
                System.out.println("Customer ID already exists.");
                return;
            }

            customerIDs[numAccounts] = customerID;

            System.out.print("Enter customer name: ");
            customerNames[numAccounts] = scanner.next();

            accountStatuses[numAccounts] = "active";

            System.out.print("Enter account type: ");
            accountTypes[numAccounts] = scanner.next();

            System.out.print("Enter initial balance: ");
            balances[numAccounts] = scanner.nextDouble();

            numAccounts++;

            System.out.println("Account created.");
        }

        public static int findCustomerIndex(String customerID) {
            for (int i = 0; i < numAccounts; i++) {
                if (customerIDs[i].equals(customerID)) {
                    return i;
                }
            }

            return -1;
        }

        public static void deposit(Scanner scanner, int index) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            if (amount < 0) {
                System.out.println("Invalid amount. Please try again.");
                return;
            }

            balances[index] += amount;

            System.out.println("Deposit successful. New balance is " + balances[index]);
        }

        public static void withdraw(Scanner scanner, int index) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount < 0) {
                System.out.println("Invalid amount. Please try again.");
                return;
            }

            if (balances[index] < amount) {
                System.out.println("Insufficient funds.");
                return;
            }

            balances[index] -= amount;

            System.out.println("Withdrawal successful. New balance is " + balances[index]);
        }

        public static void transfer(Scanner scanner, int index) {
            System.out.print("Enter recipient customer ID: ");
            String recipientID = scanner.next();

            int recipientIndex = findCustomerIndex(recipientID);

            if (recipientIndex == -1) {
                System.out.println("Recipient not found.");
                return;
            }

            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();

            if (amount < 0) {
                System.out.println("Invalid amount. Please try again.");
                return;
            }

            if (balances[index] < amount) {
                System.out.println("Insufficient funds.");
                return;
            }

            balances[index] -= amount;
            balances[recipientIndex] += amount;

            System.out.println("Transfer successful. New balance is " + balances[index]);
        }

        public static void displayAccountDetails(int index) {
            System.out.println("Customer ID: " + customerIDs[index]);
            System.out.println("Customer name: " + customerNames[index]);
            System.out.println("Account status: " + accountStatuses[index]);
            System.out.println("Account type: " + accountTypes[index]);
            System.out.println("Balance: " + balances[index]);
        }
    }
