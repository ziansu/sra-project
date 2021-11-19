private boolean waterCollides(com.jamescho.game.model.Brother b) {
    if (((brotherGo) == 1) && (waterHole.getRect().intersects(b.getRect()))) {
        return true;
    }else {
        return false;
    }
}