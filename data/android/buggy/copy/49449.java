public void resetClubList() {
    clubList.clear();
    if (((masterClubList) != null) && (!(masterClubList.isEmpty())))
        clubList.addAll(masterClubList);
    
}