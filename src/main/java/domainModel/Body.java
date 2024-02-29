package domainModel;
import java.util.ArrayList;
import java.util.List;

public class Body {
    private boolean isQuiet;
    private boolean hasCurledFingers;
    private boolean isLying;
    private List<Kilobats> heldKilobats; // Новое поле для хранения списка килобац, держащихся пальцами

    // Конструктор
    public Body(boolean isQuiet, boolean hasCurledFingers, boolean isLying) {
        this.isQuiet = isQuiet;
        this.hasCurledFingers = hasCurledFingers;
        this.isLying = isLying;
        this.heldKilobats = new ArrayList<>(); // Инициализация списка
    }

    // Методы доступа
    public boolean isQuiet() {
        return isQuiet;
    }

    public boolean hasCurledFingers() {
        System.out.println("Пальцы скрючены.");
        return hasCurledFingers;
    }

    public boolean isLying() {
        System.out.println("Тело лежит.");
        return isLying;
    }

    // Изменение состояния тела на "лежащее"
    public void lieDown() {
        System.out.println("Тело легло.");
        isLying = true;
    }

    // Добавление килобаца в список
    public void holdKilobats(Kilobats kilobats) {
        System.out.println("Тело сжало скрюченными пальцами килобац.");
        heldKilobats.add(kilobats);
    }

    // Удаление килобаца из списка
    public void releaseKilobats(Kilobats kilobats) {
        System.out.println("Тело отпустило килобац.");
        heldKilobats.remove(kilobats);
    }

    // Метод для проверки, держит ли тело килобац пальцами
    public boolean isHoldingKilobats(Kilobats kilobats) {
        return heldKilobats.contains(kilobats);
    }
}

