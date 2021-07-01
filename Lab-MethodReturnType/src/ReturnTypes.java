
public class ReturnTypes{

    public static void main(String[] args) {
        //Create a class instance
        ReturnTypes rt = new ReturnTypes();

        //Call your method here
        rt.returnNothing();

        //Call the other method here
        boolean b = rt.returnBoolean();

        System.out.println("The value of b is: " + b);
    }

    //Create your first method here
    public void returnNothing(){
        System.out.println("Inside of a void method.");
    }

    //a method that returns a boolean
    public boolean returnBoolean(){
        return true;
    }
}
