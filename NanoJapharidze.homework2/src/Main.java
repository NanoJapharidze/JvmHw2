import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ReadFile methods = new ReadFile();
            methods.aboutFile();

        }catch (IOException | InvalidNumException e){
            e.printStackTrace();
        }

        int[] massive = {9,11,23,5,7,8,32,4};
        ReadFile fileReader = new ReadFile();
        System.out.println("sum is "+ fileReader.numsSum(massive));
    }
}