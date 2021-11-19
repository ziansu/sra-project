private void moveAwayFrom(java.util.List<com.the.machine.components.BehaviourComponent.BehaviourResponse> responses, com.the.machine.behaviours.AntColonyBehaviour.AntColonyBehaviourState state, com.badlogic.gdx.math.Vector2 antiGoal) {
    rotateTowards(responses, com.the.machine.behaviours.AntColonyBehaviour.relativePositionOf(state, new com.badlogic.gdx.math.Vector2(antiGoal).scl((-1))));
}