@javax.annotation.Nonnull
public static java.util.Date getDatePart(@lombok.NonNull
java.util.Date date) {
    return info.naiv.lab.java.jmt.datetime.ClassicDateUtils.getDatePart(info.naiv.lab.java.jmt.Misc.toCalendar(date, null)).getTime();
}