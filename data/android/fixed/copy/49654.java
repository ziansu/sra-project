@com.fasterxml.jackson.annotation.JsonIgnore
public void setLastVersionDate(java.time.LocalDate date) {
    if (date != null) {
        this.lastVersionDate = date.toString();
    }
}