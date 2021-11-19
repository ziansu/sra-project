@java.lang.Override
public void remove(haven.Gob gob, haven.Gob.Overlay overlay) {
    if ((overlayWeakReference.get()) == overlay) {
        gob.delattr(CustomAttrib.ReadyHideOrTubeAttrib.class);
    }
}