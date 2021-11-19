public void goToAnswerMode() {
    java.lang.System.out.println("hi!");
    cAnswer.update();
    java.awt.CardLayout cl = ((java.awt.CardLayout) (cards.getLayout()));
    currentMode = com.blueteam.gameshow.client.ClientQuestionScreen.ANSWERMODE;
    cl.show(cards, currentMode);
}