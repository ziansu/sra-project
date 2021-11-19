private double getHighestPossibleScore() {
    if ((model.driver.Grader.getCurve().getGradeAbove(grade)) != null) {
        return (model.driver.Grader.getCurve().getGradeAbove(grade).value()) - 1;
    }
    return 100;
}