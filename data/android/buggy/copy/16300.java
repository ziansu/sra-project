@java.lang.Override
public void onClick(android.view.View v) {
    db.create(undo);
    a.dismiss();
    rv.setAdapter(new com.rpfsoftwares.rollapass.RVAdapter(db.read(), rv));
    db.closeDB();
}