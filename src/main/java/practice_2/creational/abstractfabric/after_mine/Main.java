package practice_2.creational.abstractfabric.after_mine;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String osType = "MacOs";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory(); // фабричный метод

        } else {
            guiFactory = new MacOSFactory(); // фабричный метод

        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}
