package ManipulandoDados;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ManiDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);// função para especificar somente quem é diretorio (File::isDirectory)
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);// função para especificar somente quem é arquivo (File::isFile)
        System.out.println("Files");
        for (File file : files) {
            System.out.println(file);
        }

        Boolean success = new File(strPath + "\\subdir").mkdir();// função para criar um diretorio
        System.out.println("Diretorio criado com sucesso");
    }
}
