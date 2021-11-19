public int getNumRightNotes() {
    return ((int) (java.lang.Math.round(((java.lang.Math.random()) * ((rightHandMaxNotes) - (rightHandMinNotes)))))) + (rightHandMinNotes);
}