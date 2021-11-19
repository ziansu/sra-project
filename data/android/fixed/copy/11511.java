@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    set_selected_block(3, false);
    Button_LandHere.setSelected(true);
    return false;
}