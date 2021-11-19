public void giveWeapon(me.game.weapons.Weapon waffe) {
    PlayerWeapon.ActiveWeapons.remove(hisWeapon);
    this.hisWeapon = waffe;
}