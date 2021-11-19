@javax.persistence.Transient
public java.util.List<java.lang.String> getPossibleAnswersList() {
    return java.util.Arrays.asList(possibleAnswers.split(";"));
}