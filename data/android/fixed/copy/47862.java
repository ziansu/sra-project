@java.lang.Override
public void delete() {
    super.delete();
    tile.soldiers.remove(this);
    if (tile.soldiers.isEmpty())
        tile.nat = Nationality.NEUTRAL;
    
}