import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        List<String> someList = new ArrayList<String>();
        System.out.println("Введите 5 строк, при длинне строки более 10 символов строки запишутся в файл");
        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            someList.add(reader.readLine());
        }
        File file2 = new File("file2.txt");
        PrintWriter printWriter = new PrintWriter(file2);
        for (String str : someList) {
            if (str.length() > 10) {
                fileOutputStream.write(str.getBytes(), 0, str.length());
                printWriter.println(str);
            }
        }
        fileOutputStream.close();
        printWriter.flush();
        printWriter.close();
    }
}
