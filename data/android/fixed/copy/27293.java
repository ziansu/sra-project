public void setMyBloodAlcoholRatio(int bloodAlcoholRatio) {
    this.myBloodAlcoholRatio += bloodAlcoholRatio;
    if (0 > (this.myBloodAlcoholRatio)) {
        this.myBloodAlcoholRatio = 1;
    }
}