@javax.persistence.Transient
@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isClosed() throws java.sql.SQLException {
    return ((this.dbConnection) == null) || (this.dbConnection.isClosed());
}