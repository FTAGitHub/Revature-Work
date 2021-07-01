
public class MethodDeclaration{

    public static void main(String[] args) {
        //Create a class instance
        MethodDeclaration md = new MethodDeclaration();

        //Call your first method here
        md.talk();
        md.talk();
        md.talk();
    }

    //Create your first method here
    public void talk(){
        System.out.println("Inside of the talk method.");
    }
}
