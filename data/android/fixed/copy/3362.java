@java.lang.Override
public void revertUpdate() {
    com.horstmann.violet.framework.util.ThreeStringMemento memento = caretaker.load();
    name.setText(memento.getFirstValue());
    attributes.setText(memento.getSecondValue());
    methods.setText(memento.getThirdValue());
}