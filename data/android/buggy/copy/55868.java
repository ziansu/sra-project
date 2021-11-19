@java.lang.Override
public void onClick(android.view.View v) {
    boolean shieldActive = com.infiniteshield.main.Shield.toggle(this);
    updateUI(shieldActive);
}