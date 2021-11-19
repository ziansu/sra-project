public void DeleteBugView(int BugIndex) {
    BugViewArray.remove(BugIndex);
    ResetBugIndexes();
    ChangeURLListPulldowns(BugIndex);
}