import com.ljw.dp.AbstGameConnectHelper;
import com.ljw.dp.DefaultGameConnectHelper;

public class Main_TemplateMethod {
    public static void main(String[] args) {
        AbstGameConnectHelper helper=new DefaultGameConnectHelper();
        //다른 패키지인 경우 protected인 경우 접속 안됨
        helper.requestConnection("아이디 암호등 접속정보");

    }
}
