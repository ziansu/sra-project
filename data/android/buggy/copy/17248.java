@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mButtonSec.setBackgroundColor(res.getColor(R.color.background_buttons));
    mButtonFstop.setBackgroundColor(res.getColor(R.color.background_button_chosen));
    whatWeCalculateFor = 1;
    return false;
}