public boolean ltxGameDataPathOk(java.lang.String szFile) {
    if (stalker_Ini_Editor.FileValue.pathExists(((szFile + "\\") + "gamedata\\"))) {
        szLastPathGlobal = szFile;
        ltxDateienLaden();
        return true;
    }
    return false;
}