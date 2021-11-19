public static void addToMap(int index1, int index2) {
    int[] key = new int[2];
    SimulationThread.mapIndecies(index1, index2, key);
    SimulationThread._collisionMap.put(key, true);
}