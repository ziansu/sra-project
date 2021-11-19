public static edu.softserveinc.healthbody.db.DBCreationManager getInstance() {
    if ((edu.softserveinc.healthbody.db.DBCreationManager.instance) == null) {
        synchronized(edu.softserveinc.healthbody.db.DBCreationManager.class) {
            if ((edu.softserveinc.healthbody.db.DBCreationManager.instance) == null) {
                edu.softserveinc.healthbody.db.DBCreationManager.instance = new edu.softserveinc.healthbody.db.DBCreationManager();
            }
        }
    }
    return edu.softserveinc.healthbody.db.DBCreationManager.instance;
}