import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\danie\\certificado\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){ // declarar o BufferReader e o ileReader no Try "deixa o codigo mais clean

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Erro" + e);
        }

    }
}