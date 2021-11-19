@java.lang.Override
public R call() throws java.lang.Exception {
    try (au.edu.jcu.v4l4j.impl.omx.OMXQueryControl.OMXQueryControlAccessorState state = new au.edu.jcu.v4l4j.impl.omx.OMXQueryControl.OMXQueryControlAccessorState()) {
        doCall(state);
        return state.result;
    }
}