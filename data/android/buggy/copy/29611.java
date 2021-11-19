@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    codepathproject.nothinganswered.TinderExperiment.Data data = al.remove(0);
    al.add(data);
    questionAdapter.notifyDataSetChanged();
}