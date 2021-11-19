private void updateStatesToGPU() {
    synchronized(threadManager.gameStateLock) {
        renderer.getCamera().tick(java.lang.System.currentTimeMillis());
        synchronized(relevantPositionedRenderables) {
            for (org.jtrfp.trcl.obj.PositionedRenderable renderable : relevantPositionedRenderables)
                renderable.updateStateToGPU();
            
        }
    }
}