@javax.annotation.Nonnull
public static java.util.Date getDatePart(java.util.Date date) {
    info.naiv.lab.java.jmt.Arguments.nonNull(date, "date");
    return info.naiv.lab.java.jmt.datetime.ClassicDateUtils.getDatePart(info.naiv.lab.java.jmt.Misc.toCalendar(date, null)).getTime();
}