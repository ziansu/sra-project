private static float getOverload(cn.academy.ability.api.data.AbilityData data) {
    return cn.academy.vanilla.heatmaster.skill.WorldHeater.instance.pipeFloat("overload", cn.academy.vanilla.heatmaster.skill.WorldHeater.instance.getFunc("overload").callFloat(data.getSkillExp(cn.academy.vanilla.heatmaster.skill.WorldHeater.instance)));
}