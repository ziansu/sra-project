@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    controllers.SubmitWordMove move = new controllers.SubmitWordMove(model, play);
    move.doMove();
}