public void setMeleeWeapon(com.tda367.infinityrun.MeleeWeapon weapon) {
    if (weapon != null) {
        removeChildren(weapon);
    }
    addChildren(weapon);
    meleeWeapon = weapon;
}