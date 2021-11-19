public autoParker.AutoParkImpl.PositionStatus moveBackward() {
    street[((positionStatus.position) - 1)] = isEmpty();
    positionStatus.position -= 1;
    positionStatus.empty = checkIfEmpty(positionStatus.position);
    return positionStatus;
}