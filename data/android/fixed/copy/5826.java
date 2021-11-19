@com.rafikzebdi.epargnator.domain.personne.Id
@com.rafikzebdi.epargnator.domain.personne.GeneratedValue(strategy = GenerationType.IDENTITY)
@com.rafikzebdi.epargnator.domain.personne.Column(name = "PER_ID", nullable = false)
public int getId() {
    return id;
}