package se.io;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @Todo  文件拷贝、常见文件操作（增删改查目录等）
 * @Author mina
 * @Date 2020-07-29  9:02
 */
public class FileTest {

    public static void main(String args[]){


//        File file = new File( "C:\\Users\\12345\\Desktop\\1.txt");
//        File dest = new File("C:\\Users\\12345\\Desktop\\学习\\1.txt");
//
//        try {
//            copyFile(file,dest);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            testOpFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        testOpFile();

    }


    /**
     * 使用 FileChannel 进行文件复制
     * @param source
     * @param dest
     * @throws IOException
     */
    private static  void copyFile(File source,File dest) throws IOException {

        FileChannel inputChanel=null;
        FileChannel outputChanel=null;
        try {
            inputChanel= new FileInputStream(source).getChannel();
            outputChanel = new FileOutputStream(dest).getChannel();
            outputChanel.transferFrom(inputChanel,0,inputChanel.size());

        }finally { //肯定需要一个finally块关闭资源
            inputChanel.close();
            outputChanel.close();
        }
    }


    /**
     * 使用FileInputStream 进行文件复制
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFileUsingFileStreams(File source, File dest)
            throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }


    /**
     * 使用NIO files 进行文件复制,代码行数更少
     *
     * @throws IOException
     */
    private static void copyUseNIO() throws IOException {

        File file = new File( "C:\\Users\\12345\\Desktop\\1.txt");
        System.out.println(file.isDirectory());
        Path path = file.toPath();
        OutputStream outputStream = new FileOutputStream("C:\\Users\\12345\\Desktop\\学习\\java\\22.txt");
        Files.copy(path,outputStream);

    }



    /**
     * 常见文件基础操作:
     *  一个目录其实就是一个 File 对象，它包含其他文件和文件夹。
     *  下面判断一个路径是否为文件或目录。若是目录则查询出其底下的所有文件/目录
     */
    private static  void testOpFile() {
        String dirName = "C:\\Users\\12345\\Desktop\\abcc";
        File file = new File(dirName);
        if (file.exists() && file.isDirectory()) {
            System.out.println("是一个目录");
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                String path = dirName + File.separator + list[i];
                File ff = new File(path);
                if (ff.isFile()) {
                    System.out.println(path + " ----是一个文件");
                } else {
                    System.out.println(path + " ----是一个目录");
                }
            }
        } else if (file.exists() && file.isFile()) {
            System.out.println("是一个文件");
        } else {
            file.mkdirs();
            System.out.println("找不到文件,已经创建");
        }
    }

    private static  String gtInt(int val){



        return String.valueOf(val);
    }

}
