protected void askPlayAgain(io.zipcoder.zealotscasino.Player player) {
    java.lang.String choice = io.zipcoder.zealotscasino.UserInput.getStringInput("Would you like to play again? (Push 'Y' to play again, 'Any other key' to quit war)");
    if (choice.equalsIgnoreCase("Y"))
        play(player);
    else
        io.zipcoder.zealotscasino.UserInput.display("Thanks for playing!\n\n");
    
}