public java.lang.String getEstimationModeAsString() {
    switch (estimationMode) {
        case user :
            return "user";
        case mean :
            return "mean";
        case best :
            return "best";
        case worst :
            return "worst";
        default :
        case undefined :
            throw new java.lang.AssertionError("undefined estimation mode!");
    }
}