public net.bondar.web.model.Hobby findHobbyDyTitleOpt(java.lang.String title) {
    net.bondar.web.model.Hobby result = hobbyDao.findHobbyByTitleOpt(title);
    if (result == null)
        throw new net.bondar.web.exceptions.NoSuchObjectException();
    
    return result;
}