java.util.Collection<it.uniroma1.lcl.cruciverba.Cruciverba> buildAll() {
    maxResults = 130;
    startMatch();
    if ((completedCrosswords.size()) > 0)
        return completedCrosswords;
    
    return null;
}