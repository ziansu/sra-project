public int count(java.lang.String label) {
    synchronized(countsByLabel) {
        java.lang.Integer result = countsByLabel.get(label);
        if (result == null)
            return 0;
        
        return result;
    }
}