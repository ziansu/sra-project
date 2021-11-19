@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.companyname.hearts.model.Overlord.getInstance().prepareForNextGame();
    removeCenterIcon();
    setUpGame();
    displayImages();
    createListeners();
    beginRound();
}