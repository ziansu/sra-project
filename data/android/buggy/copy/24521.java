@java.lang.Override
public int compareTo(ca.ualberta.cs.scandaloutraveltracker.Claim another) {
    return another.getStartDate().compareTo(startDate);
}