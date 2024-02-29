package domainModel;

public class Kilobats {
    private boolean isUnderFoot;

    public Kilobats() {
        this.isUnderFoot = false;
    }

    // Нога теперь на килобаце
    public void placeFootOnKilobats() {
        isUnderFoot = true;
    }

    // Находится ли килобац под ногой
    public boolean isUnderFoot() {
        return isUnderFoot;
    }
}