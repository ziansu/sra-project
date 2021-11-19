@java.lang.Override
public void init(double d, int t, int size) {
    java.lang.System.out.println("Scout init");
    this.RANDOM_GENERATOR = new java.util.Random();
    this.BOARD_SIZE = size;
    this.VISION = d;
}