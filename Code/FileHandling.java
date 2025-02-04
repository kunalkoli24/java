import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Data written to the file.");

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Data read from the file: " + line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while accessing the file: " + e.getMessage());
        }
    }
}