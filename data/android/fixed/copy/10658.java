public double getPercentDone() {
    int leftToDo = this.estimatedCoursesLeft();
    int done = (totalCoursesNeeded) - leftToDo;
    double result = (done * 1.0) / (totalCoursesNeeded);
    return result;
}