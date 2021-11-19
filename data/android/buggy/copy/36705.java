@java.lang.Override
public void estimateAnswer(java.lang.String answer) {
    usersAnswer = answer;
    if (answer.equals(possibleAnswers.get(answerId)))
        userScore = maxScore;
    
}