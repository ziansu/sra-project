public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    sg.edu.ntu.sce.fyp.calevent.model.DataManager dataMgr = sg.edu.ntu.sce.fyp.calevent.model.DataManager.getInstance();
    if (dataMgr != null) {
        dataMgr.setTimeSlotList(null);
    }
}