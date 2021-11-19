public static void exit() {
    if (edu.uci.ccai6.cs241.VarScoper.__currScope.equals("main")) {
        edu.uci.ccai6.cs241.VarScoper.__level2 = null;
        edu.uci.ccai6.cs241.VarScoper.__level1 = null;
    }else {
        edu.uci.ccai6.cs241.VarScoper.__currScope = "main";
        edu.uci.ccai6.cs241.VarScoper.__inLevel2 = false;
    }
}