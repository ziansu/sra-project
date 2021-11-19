@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.reset_button :
            board.setOnBoardInteractionListener(this);
            board.resetBoard();
            break;
    }
}