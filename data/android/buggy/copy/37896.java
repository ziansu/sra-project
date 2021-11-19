public void makeRemove(com.badlogic.ashley.core.Entity entity, java.lang.Class<? extends com.badlogic.ashley.core.Component> componentClass) {
    this.type = com.badlogic.ashley.core.Engine.ComponentOperation.Type.Remove;
    this.entity = entity;
    this.component = null;
    this.componentClass = componentClass;
}