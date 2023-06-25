package Address;

import Account.*;

import java.util.Scanner;

public class AddresMenager
{
  static Scanner input=new Scanner(System.in);

  public static Address addAddress()
  {
    Address address;
    System.out.println("Gireceğiniz adres ev adresi ise (1) iş adresi ise (2) tuşlayınız");  int choose=input.nextInt();
    while (choose<0 || choose >2)
     {
       System.out.print("Lütfen geçerli bir seçim yapınız ");
       choose=input.nextInt();
     }
    input.nextLine();//Integer değerin sonunda \n olduğu için city verisinin alınmasına engel olmasın diye kurban değişken.
    System.out.print("Lütfen şehir giriniz: ");  String city=input.nextLine();
    System.out.print("Lütfen bölge giriniz: "); String town=input.nextLine();
    System.out.print("Lütfen mahalle giriniz: "); String neighborhood=input.nextLine();
    System.out.print("Lütfen sokak giriniz: "); String street=input.nextLine();
    System.out.print("Lütfen şirket/bina ismi giriniz: "); String companyOrBuildName=input.nextLine();
    System.out.print("Lütfen şirket bina numarası/ kapı numarası giriniz: "); int companyOrDoorNumber=input.nextInt();
    if (choose==1)
      address=new HomeAddress(city,town,neighborhood,street,companyOrBuildName,companyOrDoorNumber);
    else
      address=new BusinessAddress(city,town,neighborhood,street,companyOrBuildName,companyOrDoorNumber);

    return address;
  }

  public static Address deleteAddress()
  {
    Address address;
    System.out.print("Lütfen şehir giriniz: ");  String city=input.nextLine();
    System.out.print("Lütfen bölge giriniz: "); String town=input.nextLine();
    System.out.print("Lütfen mahalle giriniz: "); String neighborhood=input.nextLine();
    System.out.print("Lütfen sokak giriniz: "); String street=input.nextLine();
    System.out.print("Lütfen şirket/bina ismi giriniz: "); String companyOrBuildName=input.nextLine();
    System.out.print("Lütfen şirket bina numarası/ kapı numarası giriniz: "); int companyOrDoorNumber=input.nextInt();

    System.out.print("Girdiğiniz adres ev adresi ise (1) iş adresi ise (2) tuşlayınız"); int choose=input.nextInt();
    while (choose<1 || choose>2)
    {
      System.out.print("Lütfen geçerli bir seçim yapınız ");
      choose=input.nextInt();
    }
    if (choose==1)
      address=new HomeAddress(city,town,neighborhood,street,companyOrBuildName,companyOrDoorNumber);
    else
      address=new BusinessAddress(city,town,neighborhood,street,companyOrBuildName,companyOrDoorNumber);

    return address;
  }
}
