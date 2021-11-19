@java.lang.Override
public void receiveInfo(group2.cs301.labyrinthgame.Game.infoMsg.GameInfo info) {
    int i = 0;
    if (info instanceof group2.cs301.labyrinthgame.Labyrinth.LabyrinthGameState) {
        labyrinthGameState = ((group2.cs301.labyrinthgame.Labyrinth.LabyrinthGameState) (info));
        updateGUI();
    }
}