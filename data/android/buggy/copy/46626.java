private void fireChangedEvent() {
    if ((listeners) != null)
        for (de.neemann.digital.draw.elements.Circuit.ChangedListener l : listeners)
            l.circuitHasChanged();
        
    
}