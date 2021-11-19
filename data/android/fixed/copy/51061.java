public void removeFinishDate() {
    filter.setFinishDate(null);
    interviews = getInterviewsWithFilter();
}