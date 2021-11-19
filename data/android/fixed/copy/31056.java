java.util.Collection<it.uniroma1.lcl.cruciverba.Cruciverba> buildAll() {
    maxResults = 0;
    startMatch();
    if ((completedCrosswords.size()) > 0)
        return completedCrosswords;
    
    return null;
}