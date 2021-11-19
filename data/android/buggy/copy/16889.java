@butterknife.OnClick(value = R.id.swtPlanAlarm)
private void toggleAlarm() {
    new fr.nawrasg.atlantis.async.DataPUT(mContext).execute(App.HOME, ("alarm=" + (swtAlarm.isChecked())));
}