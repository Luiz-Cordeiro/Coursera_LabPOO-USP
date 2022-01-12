package pacote_excecoes_java;
import java.io.FileReader;
import java.io.IOException;

class LeitorArquivo{

    public static char[] LeitorDeArquivo(String nomeArquivo, String tipoEvitado){
        char container[] = new char[1024];
        try{
            if(nomeArquivo.endsWith("."+tipoEvitado)){
                throw new FileTxtException();
            }
            FileReader fr = new FileReader(nomeArquivo);
            fr.read(container);
            fr.close();
        } catch (Exception e){
            System.out.println("Ocorreu um erro ao tentar abrir o arquivo " + e);
        }
        
        return container;
    }

    public static void main (String args[]){
       System.out.println(LeitorDeArquivo(args[0], args[1]));
    }

    // C:\Users\luizf\Desktop\File.txt
}


