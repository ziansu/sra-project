public void closeCurrentClause() {
    if ((currentClause.getParent()) != null)
        this.currentClause = this.currentClause.getParent();
    
}