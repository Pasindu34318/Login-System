import java.util.HashMap;
public void IdAndPassword {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPassword(){
        loginInfo.put("krish", "pasi");
        loginInfo.put("bro", "PASSWORD");
        loginInfo.put("dad", "1234");
    }
    protected HashMap getLoging(){
        return loginInfo;
    }
