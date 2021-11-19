@java.lang.Override
public void mapAtoB(com.robotnec.chords.persistence.entity.Performer a, com.robotnec.chords.web.dto.PerformerDto b, ma.glasnost.orika.MappingContext context) {
    java.util.Optional.ofNullable(a.getSongs()).map(java.util.List::size).ifPresent(b::setSongCount);
}