public void setResults(io.realm.RealmQuery<org.fossasia.phimpme.data.local.AccountDatabase> results) {
    this.realmResult = results;
    notifyDataSetChanged();
}