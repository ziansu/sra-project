public synchronized void onEachIteration(org.group17.Map.GameMap gmMap, double dTimePerFrame) {
    jump(gmMap);
    accelerateHorizontal(gmMap, dTimePerFrame);
    bubble(gmMap);
}