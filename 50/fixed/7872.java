@java.lang.Override
public boolean push(java.lang.String data) {
    if (isIn(data))
        return false;
    
    AntiMessDao.Datenbank.add(data);
    return true;
}