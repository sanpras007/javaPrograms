import java.util.Scanner;
class costumException extends Exception
{
    costumException(String s)
    {
        super(s); 
    }
}

public class CostumExecption 
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("ente the age to find");
            int age=sc.nextInt();
            if(age < 18)
            {
                throw new costumException("not eligible");
            }
            else
            System.out.println("you are elegible for vatindg");
        }catch(costumException ce)
        {
            System.out.println("not eligiible for voting");
        }
    }
}