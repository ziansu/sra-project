public void changed(no.ntnu.game.views.ChangeEvent event, com.badlogic.gdx.scenes.scene2d.Actor actor) {
    java.lang.String newFen = ((fen1Field) + "/") + (fen2Field);
    controller.updateUserBoard(newFen);
}