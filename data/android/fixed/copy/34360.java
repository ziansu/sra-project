public static void addToPrereqMeanings() {
    for (Prefix p : CourseList.rawPrereqs.keySet()) {
        CourseList.getPrereq(p);
    }
}