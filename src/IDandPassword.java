import java.util.HashMap;

public class IDandPassword {
HashMap<String,String> loginInfo = new HashMap<String, String>();
    IDandPassword(){
        loginInfo.put("Admin","admin123");
        loginInfo.put("mukesh","mukesh123");
        loginInfo.put("Rakesh","rakesh123");
    }
protected HashMap getloginInfo(){
        return loginInfo;
 }

}
