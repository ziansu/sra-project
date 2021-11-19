private boolean checkMemberID(java.lang.String input) {
    try {
        if ((registry.lookUpMember(java.lang.Integer.parseInt(input))) == null)
            return false;
        
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}