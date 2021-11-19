public void setMonthData(sun.bob.simcal.model.mMonthData data) {
    currentCCYY = data.getYear();
    currentMM = (data.getMonth()) + 1;
    currentDD = data.getCenterDay();
}