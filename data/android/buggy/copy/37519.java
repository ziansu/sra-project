@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        helpful.startNewActivity(in.reduxpress.ngo_ss.Activities.MainActivity.class);
        getActivity().finish();
    }else {
        helpful.logMessage(e.getMessage());
    }
}