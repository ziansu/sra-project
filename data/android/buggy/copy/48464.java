private void changeColor() {
    switch (tlc) {
        case RED :
            tlc = TrafficLightColor.GREEN;
            break;
        case YELLOW :
            tlc = TrafficLightColor.RED;
            break;
        case GREEN :
            tlc = TrafficLightColor.YELLOW;
            break;
    }
    changed = true;
    notify();
}