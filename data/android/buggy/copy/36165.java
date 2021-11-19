@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (drawingBoard.isSimulationPlaying()) {
        drawingBoard.setSimulationPlaying(false);
        simEngine.Pause();
    }else {
        drawingBoard.setSimulationPlaying(true);
        simEngine.Unpause();
    }
}