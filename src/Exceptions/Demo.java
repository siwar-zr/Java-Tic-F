package Exceptions;

class SiwarException extends RuntimeException
{
    public SiwarException(String msg){
        super(msg);
    }
}

public class Demo {

    public static void main(String a[]){

        int i = 20;
        int j = 0;


        try
        {
            j = 18/i;
            if (j==0){
                throw new SiwarException("I don't want to print zero");
            }
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.err.println("Thats's the default output "+e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);
        }




        System.out.println(j);

        System.out.println("Bye");
    }
}
