public void giveWeapon(me.game.weapons.Weapon waffe) {
    if ((hisWeapon) != waffe)
        PlayerWeapon.ActiveWeapons.remove(hisWeapon);
    
    this.hisWeapon = waffe;
}