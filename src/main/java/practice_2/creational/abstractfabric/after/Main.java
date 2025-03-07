package practice_2.creational.abstractfabric.after;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String osType = "Windows";

        if ("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
        } else {
            guiFactory = new MacFactory();
        }

        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}
