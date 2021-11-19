public void draw() {
    stroke(255);
    if (mousePressed) {
        line(mouseX, mouseY, pmouseX, pmouseY);
    }
    sc.draw();
    hand.draw();
}