public void AddFlag(java.lang.String gameName, java.lang.String teamName, java.lang.String tagSerial, java.lang.String flagName) {
    SetFlagCapturedStatus(gameName, teamName, tagSerial, Global.FlagStatus.Not_Captured);
    SetFlagName(gameName, teamName, tagSerial, flagName);
}