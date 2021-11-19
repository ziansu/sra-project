private double productionCrystal(int lvl) {
    return java.lang.Math.ceil(((((double) (20)) * lvl) * (java.lang.Math.pow(1.1, lvl))));
}