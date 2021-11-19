@java.lang.Override
public void onClick(android.view.View v) {
    if (com.fashare.activitytracker.AccessibilityUtil.checkAccessibility(this)) {
        if ((com.fashare.activitytracker.Tile.instance) != null) {
            com.fashare.activitytracker.Tile.instance.onClick();
        }
        finish();
    }
}