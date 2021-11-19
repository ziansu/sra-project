@java.lang.Override
public void onFragmentCreated(int fragmentNumber) {
    fragmentsReadyArray[fragmentNumber] = true;
    if (isAllFragmentsCreated())
        notifyFragments();
    
}