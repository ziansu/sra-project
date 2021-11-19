void setSpeed(boolean isRaining) {
    if (isRaining) {
        speed -= hu.po.Main.getRandom(5, 50);
    }else {
        speed = 100;
    }
}