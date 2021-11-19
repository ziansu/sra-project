private void stop() {
    org.jtool.macrorecorder.recorder.IMacroRecorder recorder = org.jtool.macrorecorder.recorder.MacroRecorder.getInstance();
    recorder.stop();
    recorder.removeMacroListener(this);
}