public void removeAcceleroListener(de.yadrone.base.navdata.AcceleroListener acceleroListener) {
    this.acceleroListener.remove(acceleroListener);
    setMask(((this.acceleroListener.size()) == 0), new int[]{ de.yadrone.base.navdata.NavDataManager.PHYS_MEASURES_TAG , de.yadrone.base.navdata.NavDataManager.RAW_MEASURES_TAG });
}