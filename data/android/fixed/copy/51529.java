private boolean isValidLaser() {
    for (final com.yogpc.qp.tile.TileLaser.Position laser : this.lasers)
        if (laser == null)
            return false;
        
    
    return true;
}