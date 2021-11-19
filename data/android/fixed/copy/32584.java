@java.lang.Override
public void execute(projetoum.equipe.iteach.models.ClassObject param) {
    item.setAula(param);
    adapter.add(item);
    if ((ctx) instanceof projetoum.equipe.iteach.activities.MainActivity)
        ((projetoum.equipe.iteach.activities.MainActivity) (ctx)).refreshFeedCount();
    
}