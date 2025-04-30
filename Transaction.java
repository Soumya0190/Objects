public class Transaction {
    private String vendor;
    private double amount;
    private boolean isWithdrawal;

    public static int transactionCount = 0;

    // Default constructor
    public Transaction() {
        transactionCount++;
    }

    // Parameterized constructor
    public Transaction(String vendor, double amount, boolean isWithdrawal) {
        this.vendor = vendor;
        this.amount = amount;
        this.isWithdrawal = isWithdrawal;
        transactionCount++;
    }

    // Copy constructor
    public Transaction(Transaction t) {
        this(t.vendor, t.amount, t.isWithdrawal);
    }

    // Getters and Setters
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isWithdrawal() {
        return isWithdrawal;
    }

    public void setWithdrawal(boolean isWithdrawal) {
        this.isWithdrawal = isWithdrawal;
    }
}
