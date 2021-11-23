public boolean equals(be.iminds.iot.dianne.tensor.Tensor other) {
    if (other == null)
        return false;
    else
        if ((other.address) == (this.address))
            return true;
        else
            return equals(other, 0.0F);
        
    
}