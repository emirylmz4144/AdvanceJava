import Location.*;
import Player.*;

public class Game
{
  Player player=new Player();

  Location location;

     public void run()
     {


       System.out.println("Dünyanın karanlık ve korkunç bölgesine hoşgeldin..");
       player.selectChar();


           while (true)
               {
                   if (!player.getInventory().isFireWood() || !player.getInventory().isFood()|| !player.getInventory().isWater())
                   {
                       System.out.println(player.getInventory().isFood());
                       player.selectLocation();
                   }
                   else if (player.getHealty()<=0)
                   {
                       break;
                   }
                   else if (player.getInventory().isFireWood() || player.getInventory().isFood()|| player.getInventory().isWater())
                   {
                       System.out.println(
                               "Tebrikler şovalye tüm bu zorluklardan kurtulup" +
                               "Dünyamızı kurtardınız artık Dünyanın Şahısınız " +
                               "Yüce majesteleri "+player.getPlayerName()
                                         );
                       break;
                   }

               }
     }

}
