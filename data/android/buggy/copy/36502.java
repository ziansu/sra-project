@java.lang.Override
public void updateBar(float staminaValue) {
    staminaBar.setProgress((staminaValue / 1000));
    setColor(staminaValue);
}