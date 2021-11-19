public model.Hypothesis prev(model.Hypothesis h) {
    int indexH = (this.indexOf(h)) - 1;
    if (indexH > 0)
        return this.get((indexH - 1));
    else
        return null;
    
}