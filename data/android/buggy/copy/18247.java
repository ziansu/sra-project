public boolean hasRelation(java.lang.String ratee, java.lang.String rater) throws DatabaseController.DALException {
    if ((ratee.equals("rateeIDTest")) && (rater.equals("Test2")))
        return true;
    else
        return false;
    
}