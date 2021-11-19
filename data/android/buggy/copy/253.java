@java.lang.Override
public boolean onScroll(org.osmdroid.events.ScrollEvent event) {
    refreshViewToNewSettings();
    return false;
}