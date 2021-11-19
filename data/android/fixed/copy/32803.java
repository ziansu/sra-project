@java.lang.Override
public void onClick(android.view.View v) {
    if ((clickable) && (enabled))
        toggle(position, animateSelectorDuration, true);
    
}