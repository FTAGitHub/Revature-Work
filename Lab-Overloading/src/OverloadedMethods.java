
public class OverloadedMethods {  
  
    public static void main(String[] args) {  
        //Create instance here  
        OverloadedMethods om = new OverloadedMethods();  
        om.print();  
        om.print("Second print method");  
        om.print("Second", "third");  
    }  
  
    //Overload methods here  
    public void print(){  
        System.out.println("Original print method.");  
    }  
  
    public void print(String str){  
        System.out.println(str);  
    }  
  
    public void print(String str, String str2){  
        System.out.println(str + " " + str2);  
    }  
    
}
