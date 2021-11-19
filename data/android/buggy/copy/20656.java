public void Stop(com.cburch.logisim.circuit.Circuit circ) {
    if (circ == null)
        return ;
    
    SetLabel("", circ);
    active.put(circ, false);
}