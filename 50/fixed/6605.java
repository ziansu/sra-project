@java.lang.Override
public java.lang.Void apply(@org.jetbrains.annotations.Nullable
java.lang.Void aVoid) {
    notifyFinish();
    if (loop)
        pomodoro();
    
    return null;
}