public class WrapperClass{
    public static void main(String[] args){
        // double b=null;  #this will give error
        Double b=null;
        System.out.println(b);
        Integer a=10;
        System.out.println(a.doubleValue());

        Character digit='1';
        System.out.println(Character.isDigit(digit));
    }
}