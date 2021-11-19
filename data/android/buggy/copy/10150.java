@java.lang.Override
public void playRoadBuildingCard() {
    this.firstRoadPlaced = false;
    this.secondRoadPlaced = false;
    this.startMove(PieceType.ROAD, true, false);
}