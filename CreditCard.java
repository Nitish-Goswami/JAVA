public class CreditCard {
    // Instance varaible
    private String customerName;
    private String bankName;
    private String accountNumber;
    private int creditLimit;
    private double balance;

    
    // Constructor
    public CreditCard(String customerName, String bankName, String accountNumber, int creditLimit, double balance) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = balance;
    }

    public CreditCard(String customerName, String bankName, String accountNumber, int creditLimit) {
        this(customerName,bankName,accountNumber,creditLimit,0.0);
    }


    // Getter
    public String getCustomerName() {
        return customerName;
    }
    public String getBankName() {
        return bankName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public double getBalance() {
        return balance;
    }


    // Method for adding charge to card
    public boolean charge(double price) {
        if(price+balance > creditLimit) return false;
        balance += price;
        return true;
    }

    // Method for updating payment after each transaction
    public void makePayment(Double amount) {
        balance -= amount;
    }

   
    public void printSummary() {
        System.out.println("Customer = " + this.customerName);
        System.out.println("Bank = " + this.bankName);
        System.out.println("Account = " + this.accountNumber);
        System.out.println("Balance = " + this.balance); // implicit cast
        System.out.println("Limit = " + this.creditLimit);
    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Nitish Goswami", 
                                    "SBI",
                                    "1234567890",
                                    100000,
                                    5000);

        wallet[1] = new CreditCard("Narender Maurya", 
                                    "PNB",
                                    "1753456789",
                                    100000,
                                    5000);
        wallet[2] = new CreditCard("Nikhil koli", 
                                        "HDFC",
                                        "2345678901",
                                        100000);


        for(int i=1; i<=60; i++) {
            wallet[0].charge(i*5);
            wallet[1].charge(i*10);
            wallet[2].charge(i*50);
        }
        
        for(CreditCard card : wallet ) {
            System.out.println("---------------------------");
            card.printSummary();
            System.out.println("---------------------------");
        }

    }
    
}
