import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    static  Scanner input=new Scanner(System.in);

    //Operandlara atama yapmak için o operandları tanımamız gerekiyor
    public static int AX,BX,CX,DX;

    //Dosyadaki satirlari diziye aktar
    public static String[] satirlar;

    //Dosya okuma işlemleri için
    static File file;
    static FileReader fileReader;
    static BufferedReader bufferedReader;


    //Komutların için oluşturulan listeler ve değişkenler
    public static final String atama="HRK";
    public static List<String> aritmetik= Arrays.asList("TOP","CIK","CRP","BOL");
    public static List<String> mantıksal=Arrays.asList("VE","VEY","DEG");
    public static List<String> dallanma=Arrays.asList("DB","DK","DKE","DBE","DED","D");
    public static List<String> girisCikis=Arrays.asList("OKU","YAZ");


    //Gelebilecek operandlar
    public static List<String> operandlar=Arrays.asList("AX","BX","CX","DX");
    //Olabilecek etiketler
    public static List<String> etiketler=Arrays.asList("ETİKET1","ETİKET2","ETİKET3","ETİKET4","ETİKET5","ETİKET6","ETİKET7","ETİKET8","ETİKET9","ETİKET10");

    public static void main(String[] args) throws IOException {
        dosyadakiSatirlariAl();

        for (String satir:satirlar)
        {
          String[] parcalanmisHal=parcala(satir);
          if (parcalanmisHal[0].equals(atama))
              atamaYap(parcalanmisHal[1],Integer.parseInt(parcalanmisHal[2]));
        }


    }

    public static String [] parcala(String satir)
    {
        String [] parcalanmisSatir=satir.split("[,\\s:]+");
        return parcalanmisSatir;
    }
    public static void atamaYap(String operand,int value)
    {

        if (operand.equals("AX"))
            AX=value;
        else if (operand.equals("BX"))
            BX=value;
        else if (operand.equals("CX"))
            CX=value;
        else if (operand.equals("DX"))
            DX=value;



    }

    public static void dosyadakiSatirlariAl() throws IOException {
        System.out.println("Lütfen dosya yolunu giriniz"); String filePath=input.nextLine();
        file=new File(filePath);

        fileReader= new FileReader(file);
        bufferedReader= new BufferedReader(fileReader);

        String satir;
        int satirSayisi=0;

        while ((satir=bufferedReader.readLine())!=null)
            satirSayisi++;

        satirlar=new String[satirSayisi];


        fileReader=new FileReader(file);
        bufferedReader=new BufferedReader(fileReader);

        int i=0;
        while ((satir=bufferedReader.readLine())!=null)
        {
            satirlar[i]=satir;
            i++;
        }
    }
}