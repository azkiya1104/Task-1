public class Account {
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    Account(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

        
        public void deposit(double amount) throws Exception{
            balance = amount;
           
        }
        
        
        public void withdraw(double amount) throws Exception{
            if (balance - amount >=0 ) {
            balance -= amount;
            System.out.println("withdraw = Rp. "+amount+ " jumlah balance = Rp. "+balance);
            }
            else{
                System.out.println("Less balance. You can't complete the withdraw");
            }
        }

        
        public double getBalance() {
            return balance;
        }
    

	

}
