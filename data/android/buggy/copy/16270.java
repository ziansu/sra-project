@java.lang.Override
protected void assignRoomType() {
    super.assignRoomType();
    for (com.shatteredpixel.shatteredpixeldungeon.levels.Room r : rooms) {
        if ((r.type) == (com.shatteredpixel.shatteredpixeldungeon.levels.Room.Type.TUNNEL)) {
            r.type = com.shatteredpixel.shatteredpixeldungeon.levels.Room.Type.PASSAGE;
        }
    }
}