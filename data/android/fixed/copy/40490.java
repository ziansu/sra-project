@butterknife.OnClick(value = R.id.test_button)
public void opedEditor() {
    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, com.travelersdiary.fragments.DiaryEditorFragment.getInstance()).addToBackStack(null).commit();
}