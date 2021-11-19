public void putObject(io.github.sunsetsucks.iogame.shape.GameObject obj) {
    if (renderer.toDraw.containsKey(obj.name)) {
        setShapeX_Y(obj.name, obj.translationX, obj.translationY);
    }else {
        java.lang.System.out.println("malahupitin");
    }
}