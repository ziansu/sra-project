@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult result) {
    mCurrentMatch = result.getMatch();
    takeTurn();
}