public void setBonusReduction(int i) {
    bonusReduction = i;
    if ((bonusReduction) < 0) {
        bonusReduction = 0;
    }
}