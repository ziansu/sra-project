private void scanForBots(java.util.ArrayList<util.QueryObject> list) {
    userObject = new util.UserObject(list);
    if (userObject.checkForFrequentQueries()) {
        userObject.printUserObject();
    }
}