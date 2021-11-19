public boolean removeGold(int goldToRemove) {
    if (((this.gold) - goldToRemove) >= 0) {
        this.gold = (this.gold) - goldToRemove;
        return true;
    }
    return false;
}