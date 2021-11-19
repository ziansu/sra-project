private java.lang.String getSequence(java.lang.String user) {
    java.lang.Integer round = gamers.get(user);
    return sequence.toString(round);
}