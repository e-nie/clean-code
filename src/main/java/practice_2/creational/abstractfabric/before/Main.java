package practice_2.creational.abstractfabric.before;

public class Main {
    public static void main(String[] args) {
        Button button;
        Checkbox checkbox;
        String osType = "Windows";

        if ("Windows".equals(osType)) {
            button = new WindowsButton();
            checkbox = new WindowsCheckbox();
        } else {
            button = new MacOSButton();
            checkbox = new MacOSCheckbox();
        }

        button.paint();
        checkbox.paint();
    }
}
