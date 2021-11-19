@java.lang.Override
public void revertUpdate() {
    com.horstmann.violet.framework.util.ThreeStringMemento memento = caretaker.load();
    attributes.setText(memento.getFirstValue());
    name.setText(memento.getSecondValue());
    methods.setText(memento.getThirdValue());
}