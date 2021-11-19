@java.lang.Override
public void delete() {
    nation.units.remove(this);
    tile.soldiers.remove(this);
    if (tile.soldiers.isEmpty())
        tile.nat = Nationality.NEUTRAL;
    
}