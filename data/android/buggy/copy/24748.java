boolean canHaveAsWorld(jumpingalien.model.World world) {
    return !(((world == null) || (world.isTerminated())) || (this.isTerminated()));
}