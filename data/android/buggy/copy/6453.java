@java.lang.Override
public void handle(long now) {
    core.accept(drawer);
    h.accept(drawer);
    java.lang.System.err.println(Consts.SIDE_SIZE);
}