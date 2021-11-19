@java.lang.Override
public void execute(com.inhavok.fallen.components.entity_components.EntityPhysics listener) {
    listener.changeLinearVelocity(walkVelocity);
    data.setData(listener.getLinearVelocity());
}