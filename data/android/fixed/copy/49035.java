public static java.lang.String[] convertStringToArray(java.lang.String str) {
    if ((str == null) || (str.isEmpty()))
        return null;
    
    java.lang.String[] arr = str.split(com.studio08.ronen.Zivug.Model.ContactLab.separator);
    return arr;
}