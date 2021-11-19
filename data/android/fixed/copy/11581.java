public void delete(int[] data) {
    if (data.equals(null)) {
    }else {
        for (int x : data) {
            map[x] = 0 + "";
        }
    }
    draw(map);
}