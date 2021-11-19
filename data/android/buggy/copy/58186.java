public void calcPredictedScores() {
    buildNodesAndLinks();
    calcPredictedScores(root, root.getActualComp());
}