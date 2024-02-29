package domainModel;

public class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    // Приближение к телу
    public void approachBody(Body body) {
        if (body != null && body.isQuiet()) {
            System.out.println(name + " осторожно подошёл к телу.");
        } else {
            System.out.println(name + " не мог осторожно подойти к телу.");
        }
    }

    // Поставить ногу
    public void stepOnKilobats(Kilobats kilobats, Body body) {
        kilobats.placeFootOnKilobats();
        if (kilobats.isUnderFoot()) {
            System.out.println(name + " поставил ногу на килобац.");
        } else {
            System.out.println(name + " не мог поставить ногу.");
        }
    }
}