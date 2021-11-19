@org.junit.Test
public void overlappingWithItself() throws java.lang.Exception {
    eu.mivrenik.particles.model.Particle particle = particleGenerator.nextParticle();
    org.junit.Assert.assertTrue(particle.overlaps(particle, particleR));
}