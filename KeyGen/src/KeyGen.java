import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KeyGen
{
    public static void main(String[] args)
    {
        while(true){
            InputStreamReader stdin = new InputStreamReader(System.in);
            BufferedReader bufin = new BufferedReader(stdin);
            System.out.println("提示:如果Mac地址获取失败或加密失败则会使用默认密码 \"2399754\"");
            try
            {
                System.out.println("Mac地址:");
                System.out.println("当前密码:" + AESUtils.encrypt("4579932",AESUtils.encrypt(bufin.readLine(),new SimpleDateFormat("yyyyMMdd+HH").format(new Date()))));
            }
            catch(IOException E)
            {
                System.out.println("I/O错误!");
                E.printStackTrace();
            }
            catch (Exception E)
            {
                System.out.println("加密错误!");
                E.printStackTrace();
            }
        }
    }
}