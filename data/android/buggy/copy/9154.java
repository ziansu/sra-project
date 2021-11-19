@java.lang.Override
void update() {
    this.buffer.get(0).flip();
    java.lang.System.out.println("flip");
}