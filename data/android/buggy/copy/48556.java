@java.lang.Override
public void onDestroy() {
    org.wizbots.labtab.LabTabApplication.getInstance().removeUIListener(org.wizbots.labtab.interfaces.requesters.GetProgramOrLabListener.class, this);
    progressDialog.dismiss();
    super.onDestroy();
}