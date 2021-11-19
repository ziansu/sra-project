private boolean isAncestors(java.lang.String parent, java.lang.String child) {
    java.util.List<java.lang.String> anchestors = groupRepo.findAllAncestors("child");
    if (anchestors.contains(parent))
        return true;
    
    return false;
}