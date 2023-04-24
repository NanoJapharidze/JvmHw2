import java.io.*;

public class ReadFile {
    public void aboutFile() throws IOException, InvalidNumException {
        File numbers = new File("numbers");
        java.io.FileReader reader = new FileReader(numbers);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int[] massive = new int[10];
        String readLine = bufferedReader.readLine();


        while (readLine != null) {
            int i = 0;
            massive[i] = Integer.parseInt(readLine);
            if (massive[i] < 0) {
                throw new InvalidNumException();
            }
            System.out.println(massive[i]);
            readLine = bufferedReader.readLine();
        }
        bufferedReader.close();

    }

    public int numsSum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum+=i;
        }
        return sum;
    }
}
