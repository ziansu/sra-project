@java.lang.Override
public de.setsoftware.reviewtool.model.changestructure.Fragment traceFragment(de.setsoftware.reviewtool.model.changestructure.Fragment fragment, de.setsoftware.reviewtool.model.changestructure.Revision revision) {
    return new de.setsoftware.reviewtool.model.changestructure.Fragment(this.traceFile(fragment.getFile(), revision), fragment.getFrom(), fragment.getTo(), fragment.getContent());
}