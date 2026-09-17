public class exception2{
    public static void main(String[] args){
       try{
        int n=-5;
        if (n<0){
            throw new ArithmeticException("Negative Not Allowed!!");
        }
       }
       catch(ArithmeticException e){
        System.out.println("Error : "+e.getMessage());
       }
    }
}