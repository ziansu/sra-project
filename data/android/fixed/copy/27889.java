@java.lang.Override
public boolean handleElementClick(de.blau.android.osm.OsmElement element) {
    super.handleElementClick(element);
    if (element == (this.element)) {
        main.performTagEdit(element, null, false, false);
        return true;
    }
    return false;
}