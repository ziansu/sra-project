@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.button_right)) {
        initmPopupWindowView();
        popupwindow.showAsDropDown(v, 0, 3);
    }
}