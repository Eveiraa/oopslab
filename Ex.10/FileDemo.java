import java.util.Scanner;
import java.io.File;
/**
 * FileDemo
 */
public class FileDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        File fl = new File(s);
        System.out.println("File Name:"+fl.getName());
        System.out.println("Path:"+fl.getPath());
        System.out.println("Abs Path:"+fl.getAbsolutePath());
        System.out.println("Parent:"+fl.getParent());
        System.out.println("This file is:"+(fl.exists()?"Exists":"Does not exists"));
        System.out.println("Is file:"+fl.isFile());
        System.out.println("IS Directory:"+fl.isDirectory());
        System.out.println("Is Readable:"+fl.canRead());
        System.out.println("Is Writable"+fl.canWrite());
        System.out.println("Is Absolute:"+fl.isAbsolute());
        System.out.println("File Last Modified:"+fl.lastModified());
        System.out.println("File Size:"+fl.length()+"bytes");
        System.out.println("Is Hidden:"+fl.isHidden());
    }
}