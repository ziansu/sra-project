boolean canHaveAsWorld(jumpingalien.model.World world) {
    if (world == null)
        return true;
    
    return !((world.isTerminated()) || (this.isTerminated()));
}