public void setOtherThanPreferredRoutesPenalty(int penalty) {
    int newPenalty;
    if (penalty < 0) {
        newPenalty = 0;
    }else {
        newPenalty = penalty;
    }
    this.otherThanPreferredRoutesPenalty = newPenalty;
}