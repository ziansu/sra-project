public void newGame() {
    this.primaryStage.setScene(this.getStartScene());
    controller.Observer.trigger("resetGame", new controller.SubscriberDaten());
}