@javax.persistence.Transient
public java.lang.String getGorefid() {
    return this.findFirstID(Constants.LDB_GOREF, null, Constants.SECONDARY, Constants.PRIVATE);
}