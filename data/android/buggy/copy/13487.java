@java.lang.Override
public void removeDraw(final com.linxonline.mallet.renderer.Draw _draw) {
    if (_draw instanceof com.linxonline.mallet.renderer.DrawData) {
        data.remove(_draw);
        worlds.removeDraw(((com.linxonline.mallet.renderer.DrawData) (_draw)));
    }
}