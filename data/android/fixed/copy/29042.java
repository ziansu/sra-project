@java.lang.Override
public void onError(de.geeksfactory.opacclient.apis.OpacApi.MultiStepResult result) {
    if ((getActivity()) == null) {
        return ;
    }
    dialog_wrong_credentials(result.getMessage(), false);
}