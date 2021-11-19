@java.lang.Override
public void alertDrop(int x, int y, com.vengeful.sloths.Models.Map.MapItems.MapItem itemToDrop) {
    if (!(deleteFlag)) {
        target.alertDrop(x, y, itemToDrop);
    }
}