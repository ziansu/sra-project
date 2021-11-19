public static void submitReinforcements(java.awt.Point position, int value) throws java.lang.Exception {
    if (!(tora.train.risk.GUI.StaticInformations.arenaController.reinforce(value, position, tora.train.risk.GUI.StaticInformations.getCurrentPlayer())))
        throw new java.lang.IllegalArgumentException();
    
}