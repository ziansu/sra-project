public int getIncorrectAns() {
    do {
        incorrectAnswer = generateIncorrectAns();
    } while (hasSameValueInBaffaAs(incorrectAnswer) );
    pushToBaffa(incorrectAnswer);
    android.util.Log.d("CalcurationQuestion", "1 successfully generated");
    return incorrectAnswer;
}