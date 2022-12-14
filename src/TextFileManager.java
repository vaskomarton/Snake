import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {
    /**
     * Read a file line by line and return an ArrayList of lines(String format).
     * @param filePath
     * @return ArrayList of Strings
     */
    public static List<String> getLinesOfTextFile(String filePath) {
        List<String> nameList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for (String line; (line = bufferedReader.readLine()) != null; ) {
                nameList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: wrong path!\n" + e.getMessage());
        }
        return nameList;
    }
    /**
     *Create a file if the path is empty.
     */
    public static void createFile(String path){
        try {
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Write a file with text on path. If the path is empty create it
     * @param path
     * @param text
     */
    public static void writeTxtFile(String path, String text){
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}