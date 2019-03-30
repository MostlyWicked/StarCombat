package gridObjects;

public abstract class AbstractGridShip  implements GridObject{

    public ObjectDrawType getDrawType(){
        return ObjectDrawType.Text;
    }
}
