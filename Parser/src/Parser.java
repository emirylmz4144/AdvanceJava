
import java.io.*;
import java.util.*;

public class Parser {

    static List<String> arithmetic= Arrays.asList("TOP","CIK","CRP","BOL");
    static List<String> branches=Arrays.asList("D","DB","DK","DKE","DBE","DED","DE");
    static List<String> logical=Arrays.asList("VE","VEY","HRK");
    static List<String> assigment=Arrays.asList("DEG","OKU","YAZ");

    static int exceptionLine=0;//Dosayadan gelen satırları sayıp hata varsa kaçıncı satırda var diye tutacağımız değişken
    static int exceptionCount=0;//Hata sayısı


   static Scanner input=new Scanner(System.in);

    public static void assigment(String line)//Atama komutu fonksiyonu
    {
       forOperand(line);
    }
    public static void logical(String line)//Mantıksal komutu fonskiyonu
    {
       forOperand(line);
    }
    public static void arithmetic(String line)//Aritmetik komutu fonksiyonu
    {
        forOperand(line);
    }
    public static void forOperand(String line)//Devemında operand alan komutlar için kod tekrarını önlemek
    {
        String [] elements=line.split("[,\\s]+");
        for (int i=1;i<elements.length;i++)
        {
            checkOperand(elements[i]);
        }
    }
    public static void checkOperand(String inputStr) {
        if (inputStr.contains("[") && inputStr.contains("]"))// gelen eleman istisani durum olan [ ] arasındamıdır kontrolü
        {
            //eğer [ ] arasında ise çıkarılmış hali ilgili fonksiyona gönderilir
            String innerStr = inputStr.substring(inputStr.indexOf("[")+1, inputStr.indexOf("]")).trim();
            controlOperand(innerStr);//[ ]
        }
        else
            controlOperand(inputStr);//[ ] yoksa direkt ilgili fonksiyona gönderilir
    }
    public static void controlOperand(String value)
    {
        //gelen değerin kabul edilen şartlarda olmaması durumunda kaçıncı satırda hata olduğunu hafızada turarız
        if (!(value.equals("AX") || value.equals("BX") || value.equals("CX") ||value.equals("DX")||isInteger(value)))
        {
            System.out.println(exceptionLine+ ".satırda hata var");
            exceptionCount++;
        }

    }
    public static void branches(String line)//Dallanma komutu fonskiyonu
    {
        String [] elements=line.split("[,\\s]+");
        for (int i=1;i<elements.length;i++)
            controlBranches(elements[i]);
    }

    public static void controlBranches(String value)
    {
        List<String> tickets=Arrays.asList("ETIKET1","ETIKET2","ETIKET3","ETIKET4","ETIKET1","ETIKET5","ETIKET6","ETIKET7","ETIKET8","ETIKET9","ETIKET10");
        if (!(tickets.contains(value)))
        {
            System.out.println(exceptionLine+ ".satırda hata var");
            exceptionCount++;
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Lütfen dosya adını giriniz: (Dosya yolunu tam giriniz)");String fileName=input.nextLine();
        File file=new File(fileName);

            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null)
            {
                exceptionLine++;
                if (Arrays.stream(line.split("[,\\s]+")).anyMatch(arithmetic::contains))
                    arithmetic(line);
                else if (Arrays.stream(line.split("[,\\s]+")).anyMatch(branches::contains))
                    branches(line);
                else if (Arrays.stream(line.split("[,\\s]+")).anyMatch(logical::contains))
                    logical(line);
                else if (Arrays.stream(line.split("[,\\s]+")).anyMatch(assigment::contains))
                    assigment(line);
                else
                {
                    System.out.println(exceptionLine+".satırda hata var");
                    exceptionCount++;
                }
            }
            if (exceptionCount==0)
                System.out.println("Dosyada parse işlemi başarı ile gerçekleşti ve bir hata bulunamadı");
        }
    }

