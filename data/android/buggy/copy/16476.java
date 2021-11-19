public org.ruleEditor.utils.Term getClonedSelectedTerm() {
    if (((selectedTerm) != null) && ((clonedSelectedTerm) == null))
        this.clonedSelectedTerm = selectedTerm.clone();
    
    return clonedSelectedTerm;
}