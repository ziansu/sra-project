public boolean getDataFlag(int propertyId, int id) {
    return ((propertyId == (EntityHuman.DATA_PLAYER_FLAGS) ? (this.getDataPropertyByte(propertyId)) & 255 : this.getDataPropertyLong(propertyId)) & (1L << id)) > 0;
}