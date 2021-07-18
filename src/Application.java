import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<String> list = null;
        try {
            list = readFile(new File("D:\\\\testfile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            writeFile( list ,System.getProperty("user.home") + "/filteredData.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Object> objects = new ArrayList<>();
        for (String s : list) {
            objects.add(getObjectFromCSVLine(s));
        }

    }



    public static List<String> readFile(File file) throws IOException {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        return list;
    }



    public static void writeFile(List<String> content, String path) throws IOException {
        FileWriter output = new FileWriter(path);
        try(BufferedWriter bufferedWriter = new BufferedWriter(output)){
           for (String platzhalter : content) {
               bufferedWriter.write(platzhalter + "\n");
           }
        }
    }

    public static Object getObjectFromCSVLine(String string){ //TODO: Ersetze Object durch dein Objekt das du erzeugen möchtest.
        String[] array =  string.split(";");
        Object object = null;
        // object = new Object(array[0], array[1], array[2]);
        return object;
    }


}

