@java.lang.Override
public void onGroupCollapse(int groupPosition) {
    fforganizer.activities.Mainmenu.events_expanded[groupPosition] = false;
    getWindow().getDecorView().post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            adjustHeight();
        }
    });
}