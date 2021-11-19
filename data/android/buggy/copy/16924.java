@java.lang.Override
public void onGroupCollapse(int groupPosition) {
    getWindow().getDecorView().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            adjustHeight();
        }
    });
    fforganizer.activities.Mainmenu.events_expanded[groupPosition] = false;
    adjustHeight();
}