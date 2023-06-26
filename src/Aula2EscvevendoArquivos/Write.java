package Aula2EscvevendoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String [] lines = new String[]{"Good morning", "Good afternoon", "Good nith"};

        String path = "C:\\Users\\danie\\certificado\\out.txt";


        try(BufferedWriter dw = new BufferedWriter(new FileWriter (path, true))){ // escrevendo arquivos direto no diretorio, passando os dados pelo vetor
            for (String line: lines){
                dw.write(line);
                dw.newLine();
            }

        } catch (IOException e){
            System.out.println("Erro" + e);
        }
    }
}
