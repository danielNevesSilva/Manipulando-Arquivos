package InformalçõesSobreCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class InfoCaminhoArquivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
    String srtPaht = sc.nextLine();

    File path = new File(srtPaht);

        System.out.println("GetName: " + path.getName());
        System.out.println("GetParent: " + path.getParent());
        System.out.println("GetPath: " + path.getPath());
    }
}
