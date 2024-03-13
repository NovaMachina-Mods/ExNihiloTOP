package novamachina.exntop;

import static novamachina.exntop.ExNihiloTOP.MOD_ID;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MOD_ID)
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExNihiloTOP {
  public ExNihiloTOP() {}

  public static final String MOD_ID = "exntop";
  private static final Logger log = LoggerFactory.getLogger(ExNihiloTOP.class);

  @SubscribeEvent
  public static void registerTOP(InterModEnqueueEvent event) {
    log.debug("The One Probe detected: {}", ModList.get().isLoaded("theoneprobe"));
    if (ModList.get().isLoaded("theoneprobe")) {
      CompatTOP.register();
    }
  }
}
