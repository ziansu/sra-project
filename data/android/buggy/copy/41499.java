public model.Boat lookUpBoat(int index) throws java.lang.IndexOutOfBoundsException {
    if ((index < 0) || (index >= (this.boatList.size())))
        throw new java.lang.IndexOutOfBoundsException();
    
    return this.boatList.get(index);
}