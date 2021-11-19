public void mouseReleased() {
    java.lang.System.out.println("Mouse released");
    deltaX = ((pos.x) - (parent.mouseX)) / 33;
    deltaY = ((pos.y) - (parent.mouseY)) / 33;
    java.lang.System.out.println(deltaX);
}