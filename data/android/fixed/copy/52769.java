public com.codebrig.jvmmechanic.agent.event.MechanicEvent toMechanicEvent() {
    return com.codebrig.jvmmechanic.agent.event.MechanicEvent.toMechanicEvent(java.nio.ByteBuffer.wrap(rawData));
}