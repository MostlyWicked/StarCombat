package gridObjects;

import java.util.List;

public abstract class AbstractSpaceship implements GridObject, Spaceship{

    //private String shipName;
    private String shipClass;
    private int speed;
    private int numOfTurns;
    private int turnDegree;
    private int hull;
    private int totalDamage;
    private int crippledDamage;
    private int maxCrew;
    private int skeletonCrew;
    private int crewQuality;
    private int troops;
    private Spaceship craftClass;
    private int craftFlights;
    private List<SpecialShipTrait> traits;
    private int serviceYear;
    private List<Weapon> weapons;

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumOfTurns() {
        return numOfTurns;
    }

    public void setNumOfTurns(int numOfTurns) {
        this.numOfTurns = numOfTurns;
    }

    public int getTurnDegree() {
        return turnDegree;
    }

    public void setTurnDegree(int turnDegree) {
        this.turnDegree = turnDegree;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public int getCrippledDamage() {
        return crippledDamage;
    }

    public void setCrippledDamage(int crippledDamage) {
        this.crippledDamage = crippledDamage;
    }

    public int getMaxCrew() {
        return maxCrew;
    }

    public void setMaxCrew(int maxCrew) {
        this.maxCrew = maxCrew;
    }

    public int getSkeletonCrew() {
        return skeletonCrew;
    }

    public void setSkeletonCrew(int skeletonCrew) {
        this.skeletonCrew = skeletonCrew;
    }

    public int getCrewQuality() {
        return crewQuality;
    }

    public void setCrewQuality(int crewQuality) {
        this.crewQuality = crewQuality;
    }

    public int getTroops() {
        return troops;
    }

    public void setTroops(int troops) {
        this.troops = troops;
    }

    public Spaceship getCraftClass() {
        return craftClass;
    }

    public void setCraftClass(Spaceship craftClass) {
        this.craftClass = craftClass;
    }

    public int getCraftFlights() {
        return craftFlights;
    }

    public void setCraftFlights(int craftFlights) {
        this.craftFlights = craftFlights;
    }

    public List<SpecialShipTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<SpecialShipTrait> traits) {
        this.traits = traits;
    }

    public int getServiceYear() {
        return serviceYear;
    }

    public void setServiceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

}
