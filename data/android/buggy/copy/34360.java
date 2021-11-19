public static void addToPrereqMeanings() {
    for (Prefix p : CourseList.rawPrereqs.keySet()) {
        Requirement r = CourseList.getPrereq(p);
    }
}