import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {

        int x = 1, y = 0;
        try {
            x /= y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception a) {
            System.out.println(a);
        } finally {
            System.out.println("moaaa");
        }


        Document doc=new Document();
        History historyList=new History();

        doc.setDocument("naama","aria",12);
        historyList.push(doc.createSate());

        doc.setDocument("moshe","aria",16);

        System.out.println(doc);
        System.out.println(historyList);

        doc.restore(historyList.pop());

        System.out.println(doc);
    }
    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
