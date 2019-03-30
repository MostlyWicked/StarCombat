package gridObjects;

import java.util.List;

public interface ShipType {
    public String getShipClass();

    public void setShipClass(String shipClass);

    public int getSpeed();

    public void setSpeed(int speed);

    public int getNumOfTurns();

    public void setNumOfTurns(int numOfTurns);

    public int getTurnDegree();

    public void setTurnDegree(int turnDegree);

    public int getHull();

    public void setHull(int hull);

    public int getTotalDamage();

    public void setTotalDamage(int totalDamage);

    public int getCrippledDamage();

    public void setCrippledDamage(int crippledDamage);

    public int getMaxCrew();

    public void setMaxCrew(int maxCrew);

    public int getSkeletonCrew();

    public void setSkeletonCrew(int skeletonCrew);

    public int getCrewQuality();

    public void setCrewQuality(int crewQuality);

    public int getTroops();

    public void setTroops(int troops);

    public ShipType getCraftClass();

    public void setCraftClass(ShipType craftClass);

    public int getCraftFlights();

    public void setCraftFlights(int craftFlights);

    public List<SpecialShipTrait> getTraits();

    public void setTraits(List<SpecialShipTrait> traits);

    public int getServiceYear();


    public void setServiceYear(int serviceYear);

    public List<Weapon> getWeapons();

    public void setWeapons(List<Weapon> weapons);

    public ObjectDrawType objectDrawType();
}
