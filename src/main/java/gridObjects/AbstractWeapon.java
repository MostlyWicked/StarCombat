package gridObjects;

import java.util.List;

public abstract class AbstractWeapon {
    private String name;
    private int gridRange; //In grid squares, NOT inches
    private FiringArc arc;
    private int AD;
    private List<SpecialWeaponRule> special;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGridRange() {
        return gridRange;
    }

    public void setGridRange(int gridRange) {
        this.gridRange = gridRange;
    }

    public FiringArc getArc() {
        return arc;
    }

    public void setArc(FiringArc arc) {
        this.arc = arc;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public List<SpecialWeaponRule> getSpecial() {
        return special;
    }

    public void setSpecial(List<SpecialWeaponRule> special) {
        this.special = special;
    }

}
