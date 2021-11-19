@java.lang.Override
public dat255.refugeemap.model.db.Event getEvent(java.lang.Integer id) {
    for (dat255.refugeemap.model.db.Event e : events)
        if ((e.getID()) == id)
            return e;
        
    
    return null;
}