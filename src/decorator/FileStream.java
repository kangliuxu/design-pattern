package decorator;

public class FileStream implements Stream{
    @Override
    public void read() {
        System.out.println("读取文件流");
    }
}
