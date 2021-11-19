private void loadView() {
    v_button.setEnabled((((org.spinsuite.util.Env.getTabRecord_ID(getActivity(), tabParam.getActivityNo(), 0)) > 0) && (!(m_Processed))));
}