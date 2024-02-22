import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Tokenizer {
    static Scanner input=new Scanner(System.in);
    static FileInputStream fstream;
    static BufferedReader br;

    //Kelimelerin tokenlaştırılıp belleğe atılmasını taklit etmek için ram'i taklit edecek bir dizi
    static String [] CS =new String[500];

    static  int i=0;
    public static void main(String[] args) throws IOException {

        System.out.println("Lütfen dosya adını giriniz: \n" +
                "(Dosyayı proje Ana proje dosyası içine koymayı unutmayın" +
                " yani src/idea/out gibi yerlere değil bizzat proje dosyası(Tokenizer) içine atin)"); String fileName=input.nextLine();

        connectToFile(fileName);//Dosya'ya bağlanarak komutlar alıcacaktır

        String strLine;//Dosyadaki her bir satırı okumak için geçici satır değişkeni
        while ((strLine = br.readLine()) != null) {
            //Her satırda geçici değişken satırın dolu olup olmadığına bakar.
            tokenizeLine(strLine);
        }

        for (String token : CS) {
            if (token!=null)
                System.out.println(token);

        }

        fstream.close();
    }

    /*Dosyaya bağlanma metodu*/
    static void connectToFile(String fileName)
    {
        try {
            fstream = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fstream));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void tokenizeLine(String line) {
        String[] tokens = line.split("[,\\s]+");//dosyadan aldığımız satırdan undefine edeceğimiz tokenlar

        for (String token : tokens) {
            if (!token.isEmpty()) {//Gelen satır boş değilse ekleme yapar
                CS[i] = token;
                i++;
            }
        }

    }

}