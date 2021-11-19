private void setReviewer(model.Reviewer newReviewer) {
    if ((reviewer) == null) {
        throw new java.lang.NullPointerException("No such reviewer");
    }
    reviewer = newReviewer;
}