@com.fasterxml.jackson.annotation.JsonIgnore
public jjcard.textGames.game.IWeapon setWeapon(java.lang.String a) {
    jjcard.textGames.game.IItem ar = getItem(a);
    if ((ar != null) && (ar instanceof jjcard.textGames.game.impl.Weapon)) {
        return setWeapon(((jjcard.textGames.game.impl.Weapon) (ar)));
    }
    return null;
}