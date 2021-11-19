@java.lang.Override
public void onClick(android.view.View v) {
    AnimationSupport.Reveal.closeToLeft(LLcontainerSBvolume, new com.android.simplemusic.Support.AnimationSupport.Reveal.AnimationAction() {
        @java.lang.Override
        public void onPrepare() {
        }

        @java.lang.Override
        public void onStart() {
            RFLcontainerSBvolume.setVisibility(View.GONE);
        }
    });
}