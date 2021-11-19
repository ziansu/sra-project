public void handle(javafx.event.ActionEvent e) {
    if (portfolio.activity_finder.Client.username.equals(""))
        portfolio.activity_finder.Client.stage.setScene(portfolio.activity_finder.Client.accountAction());
    else
        portfolio.activity_finder.Client.stage.setScene(portfolio.activity_finder.Client.createPost(category));
    
    portfolio.activity_finder.Client.stage.show();
}