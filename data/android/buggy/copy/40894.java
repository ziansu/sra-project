@com.fasterxml.jackson.annotation.JsonIgnore
public fi.uta.fsd.metka.model.data.value.Value originalAsValueFor(fi.uta.fsd.metka.enums.Language language) {
    return containsValueFor(language) ? getValueFor(language).originalAsValue() : null;
}