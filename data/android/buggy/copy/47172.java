public final void setDBLink(adql.db.DBTable dbLink) {
    if (!(isSubQuery()))
        this.dbLink = dbLink;
    
}