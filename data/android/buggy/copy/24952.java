private void toggleChannel(java.lang.String ch) {
    int channel = (java.lang.Integer.parseInt(ch)) - 1;
    if (channel <= 7)
        channels[channel] = !(channels[channel]);
    
}