public void setList(java.util.ArrayList<de.moelschl.hhnhochschulapp.model.ThreadListItem> workingList) {
    this.threadAdapter = new de.moelschl.hhnhochschulapp.tools.ThreadAdapter(getActivity(), workingList);
}