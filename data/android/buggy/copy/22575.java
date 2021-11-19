@com.modeliosoft.modelio.javadesigner.annotations.objid(value = "c62f96ab-e6cf-42ce-921b-370655bdf461")
@java.lang.Override
public game.Direction getDirection() {
    return game.Direction.values()[keysPressed.getFirst()];
}