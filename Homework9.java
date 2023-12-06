import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.FileInputStream;
public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("myId", "myPass");
        credentials.put("myId2", "myPass2");
        credentials.put("myId3", "myPass3");

        try {
            FileInputStream fs = new FileInputStream("C:/Users/신재호/IdeaProjects/IMGODJAEHO/db.txt");
            
        }
        catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
