public geom.Rect getBlackKeyCopy() {
    if ((blackKeys.length) > 0) {
        geom.Rect copy = new geom.Rect(blackKeys[0]);
        copy.setCenter(0, 0);
        return copy;
    }else {
        return null;
    }
}