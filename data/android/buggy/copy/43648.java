@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    if ((e.getSource()) == (ageSlider)) {
        ageLabel.setText(("Age: " + (ageSlider.getValue())));
        java.lang.System.out.println("Age slider");
    }
}