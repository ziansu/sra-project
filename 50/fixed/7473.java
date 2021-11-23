public de.thm.ap.openfit.model.sugarORM.records.Activity add(de.thm.ap.openfit.model.ISubActivity subActivity) {
    subActivity.setActivity(this);
    subActivities.add(((de.thm.ap.openfit.model.sugarORM.records.SubActivity) (subActivity)));
    return this;
}