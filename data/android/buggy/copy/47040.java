@java.lang.Override
public jsettlers.graphics.map.IMapInterfaceConnector startFinished(jsettlers.graphics.startscreen.interfaces.IStartedGame game) {
    startedGame = game;
    synchronized(waitMutex) {
        waitMutex.notifyAll();
    }
    return new jsettlers.main.replay.DummyMapInterfaceConnector();
}