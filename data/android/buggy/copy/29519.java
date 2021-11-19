public static java.util.ArrayList<MODELS.Mentee> getAllMentees() {
    java.util.ArrayList<MODELS.Mentee> allMentees = new java.util.ArrayList<>();
    MODELS.Mentee m = null;
    allMentees = DAO.MenteeDAO.getMentees();
    return allMentees;
}