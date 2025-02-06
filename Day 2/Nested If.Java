public class NestedIf{
    public static void main(String[]args){
        int a = 60;
        bool has ticket = true;
        if(has ticket == true){
            if(a>=60){
                System.out.println("Eligible for Test");
            }
            else{
                System.out.println("Pay fine then go for Test");
            }
        }
        else{
            System.out.println("Not eligible for Test");
        }
    }
}