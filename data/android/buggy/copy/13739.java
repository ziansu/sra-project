@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    showUpdateFragment(participationArrayList.toArray(new soccer.gruppe5.at.soccerappapi.Data.Participation[participationArrayList.size()])[i]);
    return false;
}