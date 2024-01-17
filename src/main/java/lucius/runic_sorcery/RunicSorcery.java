package lucius.runic_sorcery;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunicSorcery implements ModInitializer {

    public static final String MOD_ID = "runic_sorcery";
    public static Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Runic Sorcery!");
    }
}
