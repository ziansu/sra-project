@java.lang.Override
public void Stop() throws com.ves.VESException {
    if ((session.getStatus()) != (Session.Status.COMPLETED))
        session.setStatus(Session.Status.INTERRUPTED);
    
    Update();
}