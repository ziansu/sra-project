public java.lang.String ParticipantConcatenation(java.lang.String[] participants) {
    java.lang.String returner = "";
    for (java.lang.String x : participants) {
        returner = (returner + x) + ", ";
    }
    return returner;
}