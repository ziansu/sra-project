@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    globalRelayPin = position + 6;
    return com.rmc.thienle.jedi2.MainActivity.PlaceholderFragment.newInstance((position + 1), switchId);
}