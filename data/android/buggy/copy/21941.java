public Feedback loadFromFile() {
    Feedback feedback;
    return feedback = new Feedback(displayAllTasks(), GSDControl.FEEDBACK_WELCOME_MESSAGE, generateInfoBox());
}