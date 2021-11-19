public void addTentacle(world.game.objects.Cell targetCell) {
    if ((tentacleSet.size()) < (getTentacleLimit())) {
        world.game.objects.Tentacle tentacle = new world.game.objects.Tentacle(this, targetCell);
        tentacleSet.add(tentacle);
    }
}