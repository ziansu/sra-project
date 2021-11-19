private void setFirsLastId() {
    if ((utility.PeopleDateBase.peopleList) != null) {
        utility.PeopleDateBase.lastID = (utility.PeopleDateBase.peopleList.size()) - 1;
        firstID = utility.PeopleDateBase.lastID;
    }else {
        utility.PeopleDateBase.lastID = 0;
        firstID = 0;
    }
}