public void setResults(io.realm.RealmQuery<org.fossasia.phimpme.data.local.AccountDatabase> results) {
    realmResult = results;
    notifyDataSetChanged();
}