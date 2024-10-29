public class Recursive_func 
{
    public static int sumOfDigits(int n)  //Function to calculate the sum of digits
    {
        if (n == 0) //checks untill the int value becomes 0
            return 0;
        else
            return (n % 10) + sumOfDigits(n / 10); 
            // (n mod 10) gives remainder whereas (n/10) separates each digit for further addition
    }

    public static String reverseString(String str)
    {
        if (str == "") //checks until the string becomes null
        {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0); 
        /*substring index starts from 1: this separates each alphabet and saves to the right, charAt index starts at 0: so it 
        rearranges the given string's remaining letters */
    }

    public static boolean isEven(int n)
    {
        if (n == 0) // checks if the value is 0 then number is even 
        {
            return true;
        } 
        else 
        {
            return isOdd(n - 1); 
            //indirect recursion for checking even number: subtract 1 from the given number returns false if number is odd
        }
    }

    // Helper function to check if a number is odd using indirect recursion
    public static boolean isOdd(int n) 
    {
        if (n == 0) 
        {
            return false;
        } 
        else 
        {
            return isEven(n - 1);
        }
    }

    // Main method
    public static void main(String[] args) 
    {
        int num = 3679;
        System.out.println("Sum of digits are = " + sumOfDigits(num)); 

        System.out.println("The reversed string is = " + reverseString("Hamza")); 

        System.out.println("The given number is: " + isEven(0));
        
    }
}
