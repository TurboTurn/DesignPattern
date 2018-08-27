package decorator.装饰javaIO类;

import java.io.*;

/**
 * @Author : ys
 * @Date : 2018/8/27 20:06 星期一
 **/
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("src/decorator/装饰javaIO类/test.txt")));
        while ((c = in.read()) >=0)
            System.out.print((char)c);
        in.close();
    }
}
