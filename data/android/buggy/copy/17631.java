private boolean partialAssignment(java.lang.Class weeklyClass) {
    if (assignIgnoringQualifications(weeklyClass)) {
        return true;
    }else
        if (availablePartialHours(weeklyClass)) {
            return true;
        }
    
    return false;
}