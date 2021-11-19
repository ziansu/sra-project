public void onClick(android.content.DialogInterface dialog, int which) {
    if (which < ((available.length) - 1)) {
        add(availableTiles[which]);
    }else {
        showBroadcastTileDialog();
    }
}