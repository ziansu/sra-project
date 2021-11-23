public void checkID(java.lang.String studentID) {
    if (aGradeSystem.containsID(studentID)) {
        showWelcomeMsg();
        userID = studentID;
        promptCommand();
    }else {
        showErrorMsg();
    }
}