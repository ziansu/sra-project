private static void setup() {
    entityPool = new ObjectPool<Entity>(ObjectHandler.ENTITY_INIT_COUNT, Entity.class);
    entityPrototypes = new java.util.ArrayList<Entity>();
    entityPrototypeIds = new java.util.HashMap<java.lang.String, java.lang.Integer>();
}