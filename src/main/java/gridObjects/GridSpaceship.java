package gridObjects;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Random;

public class GridSpaceship extends AbstractGridShip {

    private int locationX;
    private int locationY;
    ShipType baseShip;
    private String name;
    private long uid;

    public GridSpaceship(ShipType baseShip, String name, int uid){
        this.baseShip = baseShip;
        this.uid = uid;
    }

    public int getX() {
        return locationX;
    }

    public int getY() {
        return locationY;
    }

    public void setX(int x){
        this.locationX = x;
    }

    public void setY(int y){
        this.locationY = y;
    }

    public int getSizeX() {
        throw new NotImplementedException();
    }

    public int getSizeY() {
        throw new NotImplementedException();
    }

    @Override
    public String getDrawSource() {
        return name + " / " + baseShip.getShipClass();
    }
}
