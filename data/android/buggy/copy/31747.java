private void animateFrame(csci4020.shawnbickel_judsonthomas.final_project.bickel_thomas_tetris.TetrisGameView.GraphicBlock blockToAnimate) {
    if ((currentFrame) < (numFrames)) {
        frameAction(blockToAnimate);
    }
    (currentFrame)++;
}