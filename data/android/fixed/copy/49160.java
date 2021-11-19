private void setReviewer(model.Reviewer newReviewer) {
    if (newReviewer == null) {
        throw new java.lang.NullPointerException("No such reviewer");
    }
    reviewer = newReviewer;
}