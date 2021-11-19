public java.lang.String startOverAction() {
    java.util.Collections.shuffle(problems);
    currentProblem = 0;
    score = 0;
    tries = 0;
    response = "";
    return "startOver";
}