public static boolean have_conflict(ucsbCurriculum.Utility.Time t1, ucsbCurriculum.Utility.Time t2) {
    return (t1.startTime) > (t2.startTime) ? (t1.startTime) > (t2.endTime) : (t2.startTime) > (t1.startTime);
}