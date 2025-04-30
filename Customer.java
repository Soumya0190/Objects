import java.util.ArrayList;

public class Customer {
    private static int lastAccountNumber = 0;

    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;
    private double interestRate; // e.g., 0.043 for 4.3%
    private Address address;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // Constructor
    public Customer(String firstName, String lastName, double balance, double interestRate, Address address) {
        this.accountNumber = ++lastAccountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.interestRate = interestRate;
        this.address = new Address(address); // Defensive copy
    }

    // Copy constructor
    public Customer(Customer other) {
        this.accountNumber = ++lastAccountNumber;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.balance = other.balance;
        this.interestRate = other.interestRate;
        this.address = new Address(other.address); // Deep copy
        this.transactions = new ArrayList<>(other.transactions); // Shallow copy of transaction references
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate / 100.0;
    }

    public Address getAddress() {
        return new Address(address); // Return a copy
    }

    public void setAddress(Address address) {
        this.address = new Address(address); // Defensive copy
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }

    public void addTransaction(String vendor, double amount, boolean isWithdrawal) {
        Transaction t = new Transaction(vendor, amount, isWithdrawal);
        transactions.add(t);

        if (isWithdrawal) {
            balance -= amount;
        } else {
            balance += amount;
        }
    }

    public double applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        return interest;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s\n", firstName, lastName));
        sb.append(String.format("Account Number: %d\n", accountNumber));
        sb.append("Address:\n").append(address.toString()).append("\n");

        for (Transaction t : transactions) {
            String sign = t.isWithdrawal() ? "-" : "+";
            sb.append(String.format("%s: %s$%.2f\n", t.getVendor(), sign, t.getAmount()));
        }

        sb.append(String.format("Current Balance: $%.2f\n", balance));
        return sb.toString();
    }
}
