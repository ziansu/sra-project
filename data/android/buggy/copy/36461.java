@java.lang.Override
public void applyBoon(model.entity.Entity entityToAffect) {
    utilities.SoundEffect gogo = new model.abilities.BindWoundsSoundEffect();
    model.entity.EntityEffectHandler.applyHeal(entityToAffect, ((this.heal) * (this.getEntity().getSkillValue("Boon"))));
}