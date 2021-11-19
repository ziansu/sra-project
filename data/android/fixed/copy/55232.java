public modelrailway.simulation.Track getBack() {
    if ((track[1]) == (track[0]))
        return getFront();
    
    return track[1];
}