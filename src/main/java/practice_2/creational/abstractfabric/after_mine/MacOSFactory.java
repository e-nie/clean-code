package practice_2.creational.abstractfabric.after_mine;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }
}
