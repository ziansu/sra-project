private org.stephenfox.dittimetables.timetable.Timetable createTimetable(java.util.ArrayList<org.stephenfox.dittimetables.timetable.TimetableSession> sessions) throws org.stephenfox.dittimetables.timetable.EmptySessionsArrayException {
    org.stephenfox.dittimetables.timetable.TimetableGenerator generator = new org.stephenfox.dittimetables.timetable.TimetableGenerator(sessions);
    org.stephenfox.dittimetables.timetable.Timetable timetable = generator.generateTimetable();
    return timetable;
}