public void addAcceleroListener(de.yadrone.base.navdata.AcceleroListener acceleroListener) {
    this.acceleroListener.add(acceleroListener);
    setMask(((this.acceleroListener.size()) == 1), new int[]{ de.yadrone.base.navdata.NavDataManager.PHYS_MEASURES_TAG , de.yadrone.base.navdata.NavDataManager.RAW_MEASURES_TAG });
}