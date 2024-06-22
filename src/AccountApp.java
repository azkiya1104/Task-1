public class AccountApp {
    public static void main(String[] args) throws Exception {
        Account myAccount = new Account("12345", 0, "Azkiya","Azkiyalaili1104@gmail.com", "08123456789");
        
        System.out.println("Account : "+myAccount.accountNumber);
        System.out.println("Balance : "+myAccount.balance);
        System.out.println("Customer Name : "+myAccount.customerName);
        
        myAccount.deposit(1000000);
        System.out.println("jumlah balance : "+myAccount.getBalance());
        myAccount.withdraw(1000000);
        myAccount.withdraw(1000000);
        myAccount.withdraw(1000000);
        myAccount.withdraw(500000);
        System.out.println("jumlah balance : "+myAccount.getBalance());
    }
}
