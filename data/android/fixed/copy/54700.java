public java.util.List<sourcePackage.Submission> getSubmissions(sourcePackage.Database base, java.sql.Connection connection, int limit) {
    if ((base == null) || (limit <= 0))
        return null;
    
    return base.getUserSubmissions(this.userName, limit, connection);
}