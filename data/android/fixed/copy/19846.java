public boolean equals(edu.calpoly.cpe305.ConnectFour.Model.Game.Piece other) {
    if (other != null)
        return (this.getColor()) == (other.getColor());
    
    return false;
}