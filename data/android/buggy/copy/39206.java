@java.lang.Override
public boolean add(view.RoomRectangle roomRectangle) {
    if (this.contains(roomRectangle)) {
        throw new java.lang.IllegalArgumentException("Duplicate child: ");
    }
    return super.add(roomRectangle);
}