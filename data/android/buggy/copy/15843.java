public boolean isGameFinished() {
    for (model.hexModel hM : hexModelArray) {
        if ((hM.isEnemy()) == false) {
            return false;
        }
    }
    return true;
}