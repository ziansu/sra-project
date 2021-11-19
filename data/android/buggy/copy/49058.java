public java.lang.String getReinforcementString(int reinforcements) {
    if (reinforcements > 1) {
        return "enemies";
    }else {
        return "enemy";
    }
}