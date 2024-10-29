public class Bank_Account_Main
{
    public static void main(String[] args) 
    {
        Bank_Account bank = new Bank_Account(34560, "Hamza", 0);
        bank.deposit(4567);
        try {
            bank.withdraw(2375);    
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Your current balance is: " + bank.getBalance());
    }

}