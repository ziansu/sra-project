@java.lang.Override
public java.lang.String getSimpleRobotName() {
    if ((selectedVersion) != (AtlasRobotVersion.ATLAS_UNPLUGGED_V5_NO_FOREARMS))
        return "Atlas";
    else
        return "AtlasNoForearms";
    
}