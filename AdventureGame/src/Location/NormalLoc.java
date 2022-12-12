package Location;

import Player.Player;

public abstract class NormalLoc extends Location
{
    NormalLoc(String name, Player player)
    {
        super(name, player);
    }
    @Override
    public boolean onLocation()
    {
        return true;
    }

}
