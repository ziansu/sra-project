public void play(java.lang.String name) {
    if (!(anims.containsKey(name)))
        throw new java.lang.RuntimeException((("Animation titled " + name) + " isn't registered."));
    
    playing = anims.get(name);
    stateTime = 0.0F;
}