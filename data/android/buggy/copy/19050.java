public static org.activityinfo.model.form.FormInstance newKeyedInstance(org.activityinfo.model.date.DateRange dateRange, org.activityinfo.model.resource.ResourceId subFormId) {
    return new org.activityinfo.model.form.FormInstance(org.activityinfo.ui.client.component.form.subform.KeyInstanceGenerator.periodId(dateRange), subFormId);
}