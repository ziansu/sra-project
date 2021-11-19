@java.lang.Override
public java.util.List<lv.freeradiusgui.domain.Device> readListFromFile() {
    java.util.List<java.lang.String> listFromFile = readFile(appConfig.getPathToUsersFile());
    if (listFromFile == null)
        return null;
    
    listFromFile = removeComments(listFromFile);
    return parseList(listFromFile);
}