private void nextSwarmWave() {
    _alreadyDead = 0;
    _alreadySpawn = 0;
    (_curWave)++;
    if ((_curWave) >= (needToKill.length)) {
        deactivate();
    }else {
        director.extension.sender.sendNextWave(swarmId);
    }
}