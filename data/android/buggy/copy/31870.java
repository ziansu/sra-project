public void addVolunteer(museumtimetracking.be.Volunteer volunteer) throws museumtimetracking.exception.DALException {
    try {
        volunteerDAO.createVolunteer(volunteer);
    } catch (java.sql.SQLException ex) {
        throw new museumtimetracking.exception.DALException(museumtimetracking.dal.FacadeDAO.DB_CONNECTION_ERROR, ex);
    }
}