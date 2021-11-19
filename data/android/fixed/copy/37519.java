@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        getActivity().finish();
        helpful.startNewActivity(in.reduxpress.ngo_ss.Activities.MainActivity.class);
    }else {
        helpful.logMessage(e.getMessage());
    }
}