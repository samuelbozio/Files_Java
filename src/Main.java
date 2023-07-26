import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String diretorio = "/home/samuel/IdeaProjects/files-1/arquivos";
        File file =  new File(diretorio, "file.txt");
        try {
           boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}