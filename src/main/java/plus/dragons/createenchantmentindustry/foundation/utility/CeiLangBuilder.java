package plus.dragons.createenchantmentindustry.foundation.utility;

import com.simibubi.create.foundation.utility.LangBuilder;
import joptsimple.internal.Strings;
import net.minecraft.network.chat.MutableComponent;

import java.util.List;

public class CeiLangBuilder extends LangBuilder {
    public CeiLangBuilder(String namespace) {
        super(namespace);
    }

    @Override
    public void forGoggles(List<? super MutableComponent> tooltip, int indents) {
        tooltip.add(CeiLang.builder()
                .text(Strings.repeat(' ', 4 + indents))
                .add(this)
                .component());
    }
}
