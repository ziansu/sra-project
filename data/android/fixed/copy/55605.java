@javax.persistence.Transient
public java.util.List<java.lang.String> getPossibleAnswersList() {
    if ((possibleAnswers) != null) {
        return java.util.Arrays.asList(possibleAnswers.split(";"));
    }else
        return new java.util.ArrayList<java.lang.String>();
    
}