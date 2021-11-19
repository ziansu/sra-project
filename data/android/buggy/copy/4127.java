public double getFleschScore() {
    return (206.835 - (1.015 * ((getNumWords()) / (getNumSentences())))) - (84.6 * ((getNumSyllables()) / (getNumWords())));
}