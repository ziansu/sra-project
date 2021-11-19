@java.lang.Override
public void onDestroy() {
    vuforiaLocalizer = null;
    trackablesList.clear();
    trackableList.clear();
}