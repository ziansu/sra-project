@java.lang.Override
public void onClick(android.view.View v) {
    if ((isOpenInvite) && (position == 0)) {
        listener.onItemClick(v, position);
    }
}