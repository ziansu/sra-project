@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    Button_Takeoff.setSelected(true);
    set_selected_block(0, false);
    return false;
}