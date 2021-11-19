@java.lang.Override
public void start(com.tskbdx.sumimasen.scenes.model.entities.Entity active, com.tskbdx.sumimasen.scenes.model.entities.Entity passive) {
    super.start(active, passive);
    passive.setX(x);
    passive.setY(y);
    end();
}