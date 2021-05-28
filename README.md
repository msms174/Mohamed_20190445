# Mohamed_20190445

package bankingsystem;


public class Account extends Object 
{
    //initializing attributes.
    protected int balance;
    protected int account_number;
    static int count=0;
    
    public Account()//constructor to set initial value
    {
        count++;//counter to set account number
        balance=0;
        account_number=count;
    }
    public void SetBalance(int b)
    {
        balance=b;
    }
    public void SetAccount_num(int num)
    {
        account_number=num;
    }

    public int GetBalance() 
    {
        return balance;
    }

    public int GetAccount_num()
    {
        return account_number;
    }
    @Override
    public String toString()//built-in function do overriding to it to display Account info.
    {
       
        String s=String.valueOf(account_number);
       
        String r=String.valueOf(balance);

        return("Account number is "+s+"\nand his balance = "+r);
    }
    public void withdraw(int n)//function to take money from Account
    {
        if(balance>=n && n>0)
            balance-=n;
    
    }
    public void deposit(int n)//tool to put money in Account
    {
        if(n>0)
            balance+=n;
    }
}
