public boolean Chance(int Chance) {
    int number = ((int) ((java.lang.Math.random()) * 100));
    if (number < Chance) {
        return true;
    }else {
        return false;
    }
}