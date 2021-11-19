@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isOutdated() {
    return (timestamp.getTime()) < ((new java.util.Date().getTime()) - (3600 * 1000));
}