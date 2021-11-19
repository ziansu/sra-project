public static persistance.DAL givemeDAL() {
    if ((persistance.DAL.dal) == null)
        persistance.DAL.dal = new persistance.DAL();
    
    return persistance.DAL.dal;
}