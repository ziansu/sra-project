public void gain_hp(int gnhp) {
    if ((hp) > 0) {
        hp += gnhp;
        hp = java.lang.Math.min(hp, max_hp);
    }
}