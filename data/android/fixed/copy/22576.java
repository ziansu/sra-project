@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_bet_acept :
            bet = 1;
            communication.sendBet(bet);
            break;
    }
}