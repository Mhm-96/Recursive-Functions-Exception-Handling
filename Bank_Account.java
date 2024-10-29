class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class Bank_Account
{
    private int AccountNumber;
    private String AccountHolderName;
    private double balance;

    public Bank_Account(int AccountNumber, String AccountHolderName, double balance)
    {
        if(this.balance < 0) 
        //checks balance if less than 0 then throws exception message
        {
            throw new IllegalArgumentException("Initial balance should not be less or equal than zero");
        }
        else 
        {
            this.balance = balance;
            //if balance greater than 0 saves in balance.
        }
        this.AccountNumber = AccountNumber;
        this.AccountHolderName = AccountHolderName;
    }
    public void deposit (double amount)
    {

        if( amount > 0 )
        //checks the amount should be greater than 0 and saves in balance
        {
            this.balance = amount;
            System.out.println("Your Current Balance is: " + amount);
        }
        else
        {
            throw new IllegalArgumentException("Balance should not be less or equal than zero");
        }
    }

    public double getBalance()
    //shows current balance
    {
        return balance;
    }
    public void withdraw(double withdrawAmount) throws InsufficientFundsException
    {
        if (withdrawAmount > 0)
        {
            if(withdrawAmount <= balance)
            //check for withdraw amount should be greater than 0 then check if its less than current balance
            {
                balance -=  withdrawAmount; //minus withdraw amount frm balance and saves in balance
                System.out.println("Your remaining balance is: " + this.balance);
            }
            else
            {
                throw new InsufficientFundsException("The withdrawl amount exceeds your available balance");
            }
        }
        else
        {
            throw new IllegalArgumentException("Balance should not be less or equal than zero");
        }

    }
}

