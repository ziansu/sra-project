public Feedback loadFromFile() {
    return new Feedback(displayAllTasks(), GSDControl.FEEDBACK_WELCOME_MESSAGE, generateInfoBox());
}