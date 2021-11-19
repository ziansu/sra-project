private static int methodWaitTillDone(java.nio.IntBuffer srcNames, java.nio.IntBuffer audioState) {
    alGetSourcei(srcNames.get(0), io.github.subiyacryolite.enginev1.AL_SOURCE_STATE, audioState);
    return audioState.get(0);
}