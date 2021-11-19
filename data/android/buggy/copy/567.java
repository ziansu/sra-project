@java.lang.Override
public void onClick(android.view.View view) {
    if (org.catrobat.catroid.ProjectManager.getInstance().getComingFromScriptFragmentToSoundFragment()) {
        org.catrobat.catroid.ProjectManager.getInstance().setKillSoundFragmentAfterAddButtonClickedInScriptFragment(true);
    }
    fragment.addSoundRecord();
    this.dismiss();
}