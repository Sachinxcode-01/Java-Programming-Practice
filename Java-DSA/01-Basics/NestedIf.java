public class NestedIf
{
    public static void main(String[] args)
    {
        int age=18;
        boolean hasLicense= true;


        if (age>=18)
        {
            if (hasLicense)
            {
                System.out.println("You can Drive!");
            }
            else
            {
                System.out.println("License Required!");

            }
        }
        else
        {
            System.out.println("Your are Underage!");
        }
        
    }
}