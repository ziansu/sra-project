private static int countSpecificOutcome(java.lang.String outcome, java.util.List<main.Patient> data) {
    int count = 0;
    for (main.Patient p : data) {
        if (p.getOutcome().equals(outcome))
            count++;
        
    }
    return count;
}