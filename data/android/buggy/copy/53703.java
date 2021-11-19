public static persistance.DAL givemeDAL() {
    if ((persistance.DAL.dal) == null)
        persistance.DAL.dal = new persistance.DAL();
    
    persistance.DAL.dal.setHosts();
    return persistance.DAL.dal;
}