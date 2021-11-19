protected long getPointsWithinOncePlay() {
    double points = ((getMfBasicPoints()) * (songRankRatio)) * (comboRankRatio);
    return pointAddition ? java.lang.Math.round((points * 1.1)) : java.lang.Math.round(points);
}