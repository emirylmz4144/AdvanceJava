import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException
    {
        URL url=new URL("https://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt");//içeriği alacağımız url
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();//url'ye bağlanıyoruz

        InputStream inputStream=connection.getInputStream();//Siteden alınan içerik için input stream oluşturuyoruz

        FileOutputStream fileOutputStream=new FileOutputStream("emir.txt");//Bir dosyaya yazdırma için stream oluşturuyoruz

        StringBuilder builder=new StringBuilder();//Daha sonra lazım olacak bir string yapıcısı

        byte [] buffer=new byte[1024];//Veriler byte cinsi üzerinden olacağı için(ham veri almak(garanti olsun diye)) byte dizisi
        int i=0;
        while ((i=inputStream.read(buffer))!=-1)//Okumayı byte dizisi üzerinden yapacağız
        {
            builder.append(Arrays.copyOfRange(buffer,0,i));//String yapıscısı ile byte dizisini stringe çeviriyoruz.
            fileOutputStream.write(Arrays.copyOfRange(buffer,0,i));//Dosyaya içeriği yazdırıyoruz
        }
        builder.toString();//İçeriği konsol'a yazdırıyoruz..

        //Unutma : inputStream byte inputStramReader char dizisi alır
    }
}