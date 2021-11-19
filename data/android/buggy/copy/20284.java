public de.ra.simulation.Particle createParticle(double x, double y) {
    de.ra.simulation.Particle particle = new de.ra.simulation.Particle(getParticleMass(), getParticleDensity(), x, y);
    synchronized(particleList) {
        particleList.add(particle);
    }
    return particle;
}