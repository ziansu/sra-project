public int getMove() {
    mcts.TreeNode chosenNode = select();
    if (chosenNode != null) {
        return nodeMove(chosenNode);
    }else {
        return -1;
    }
}