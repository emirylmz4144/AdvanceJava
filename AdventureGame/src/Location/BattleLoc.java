package Location;
import Obstacle.*;
import Player.*;
import java.util.Random;

public abstract class BattleLoc extends Location
{
    Obstacle obstacle;
    Random random = new Random();
    private int obstacleQuality;


    public BattleLoc(String name, Player player, Obstacle obstacle)
    {
        super(name, player);
        this.obstacle = obstacle;
    }

    @Override
    abstract public boolean onLocation();



}