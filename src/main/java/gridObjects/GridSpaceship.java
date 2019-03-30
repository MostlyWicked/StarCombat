package gridObjects;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class GridSpaceship implements GridObject {

    private int locationX;
    private int locationY;
    Spaceship baseShip;

    public GridSpaceship(Spaceship baseShip){
        this.baseShip = baseShip;
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
}
