public static synchronized int dateToDays(final java.util.Date date) {
    uk.ac.standrews.cs.utilities.DateManipulation.CALENDAR.setTime(date);
    return uk.ac.standrews.cs.utilities.DateManipulation.millisToDays();
}