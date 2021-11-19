@java.lang.Override
java.lang.String findDate(java.lang.String file) {
    int indexDate = (file.indexOf("Дата выпуска:", 0)) + 14;
    java.lang.String output;
    output = file.substring(indexDate, (indexDate + 10)).trim();
    return output;
}