public com.mantono.gym.Workout nextWorkout() {
    if (sessions.isEmpty())
        throw new java.lang.IllegalStateException();
    
    return sessions.peek();
}