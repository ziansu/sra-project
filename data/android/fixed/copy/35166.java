public void adjust(model.curve.Grade grade, double max, double min) {
    try {
        grade.set(max, min);
    } catch (java.lang.IllegalArgumentException e) {
        model.driver.Debug.log("Grade Not Adjusted: Invalid Grade Range Argument(s)");
    }
}