private void checkIsLocationUnique(java.lang.String room, java.lang.Integer section) {
    if (companyDao.existsLocation(room, section))
        throw new florian_haas.lucas.business.LucasException("Another company is assigned to the location");
    
}