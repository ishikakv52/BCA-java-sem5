public class exception{
    public static void main(String[] args){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[5]);
        }
        catch(Exception e){
            System.out.println("Not exists");

        }
        finally{
            System.out.println("This line always executes");
        }
    }
}