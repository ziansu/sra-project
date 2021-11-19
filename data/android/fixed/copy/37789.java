@org.junit.Test
public void showWeightDialogShouldRender() {
    activity.showWeightDialog(0);
    assertNotNull(activity.getFragmentManager().findFragmentByTag(ChildDetailTabbedActivity.DIALOG_TAG));
}