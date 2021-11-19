public java.lang.String getAdj(java.lang.String noun, java.util.Set exclude) {
    if ((numAdj(noun)) == 0) {
        return null;
    }
    eu.aria.dialogue.KnowledgeDB.KnowledgeItem ki = verifyEntry(noun);
    return ki.getAdj(exclude);
}