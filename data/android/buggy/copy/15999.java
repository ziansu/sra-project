public void onClick(android.content.DialogInterface dialog, int which) {
    com.genevieveluyt.multiplayercardgames.CrazyEightsGameBoard.chosenSuit = which + 1;
    if (MainActivity.DEBUG)
        java.lang.System.out.println(("CrazyEightsGameBoard|activateGUI(): chose suit " + (com.genevieveluyt.multiplayercardgames.Card.suitToString(com.genevieveluyt.multiplayercardgames.CrazyEightsGameBoard.chosenSuit))));
    
    com.genevieveluyt.multiplayercardgames.CrazyEightsGameBoard.activity.findViewById(R.id.leaveButton).setClickable(true);
}