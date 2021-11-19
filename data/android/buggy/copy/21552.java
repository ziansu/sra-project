protected void setPosition(Position setPositionTo) {
    if ((Position.validatePosition(position)) == true) {
        position = setPositionTo;
    }else
        throw new java.lang.IllegalArgumentException("Position must either be Goalkeeper, Defender, Midfielder or Forward");
    
}