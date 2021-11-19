synchronized void changeColor() {
    switch (tlc) {
        case RED :
            tlc = TrafficLightColor.GREEN;
            break;
        case YELLOW :
            tlc = TrafficLightColor.RED;
            break;
        case GREEN :
            tlc = TrafficLightColor.YELLOW;
    }
    changed = true;
    notify();
}