@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvt) {
    switch (direction) {
        case UP :
            java.lang.System.out.println("UP");
            break;
        default :
            break;
    }
    gameController.move(direction);
}