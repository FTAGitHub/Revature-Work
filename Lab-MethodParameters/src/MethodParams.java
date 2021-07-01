
public class MethodParams{

    public static void main(String[] args) {
        //Create a class instance.
        MethodParams mp = new MethodParams();

        //Call your method here.
        double d = mp.convertIntToDouble(44);

        //Print the value to the console.
        System.out.println(d);

        //Call the 2nd method here.
        System.out.println(mp.sum(1.0, 2, 3));
    }

    //Create your first method here.
    public double convertIntToDouble(int num){
        return (double)num;
    }

    //New sum method here.
    public double sum(double num1, int num2, int num3){
        return num1 + num2 + num3;
    } 
}
