@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mButtonSec.setBackgroundColor(res.getColor(R.color.background_button_chosen));
    mButtonFstop.setBackgroundColor(res.getColor(R.color.background_buttons));
    whatWeCalculateFor = 0;
    return false;
}