public void AddFlag(java.lang.String gameName, java.lang.String teamName, java.lang.String flagName, java.lang.String tagSerial) {
    SetFlagCapturedStatus(gameName, teamName, tagSerial, Global.FlagStatus.Not_Captured);
    SetFlagName(gameName, teamName, tagSerial, flagName);
}