public void onPageLoaded(DatabaseCon dbCon, long courseID) {
    if ((loaded) == false) {
        templateID = getTemplateID(dbCon, courseID);
        this.courseID = courseID;
        getObjects(dbCon, templateID);
        loaded = true;
    }
}