private boolean waterCollides(com.jamescho.game.model.Brother b) {
    if (((brotherGo) == 0) && (waterHole.getRect().intersects(b.getRect()))) {
        return true;
    }else {
        return false;
    }
}