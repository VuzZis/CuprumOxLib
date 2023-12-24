package com.skoow.cuprumox;

import com.skoow.cuprumox.api.CuprumoxMod;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.UUID;

@Mod(value = Cuprumox.ID)
public class Cuprumox extends CuprumoxMod {
    public static final String ID = "cuprumox";

    @Override
    public void commonSetupEvent(FMLCommonSetupEvent event) {
        LOGGER.info(ID+" common stage--");
    }

    @Override
    public void serverStartEvent(ServerStartingEvent event) {
        LOGGER.info(ID+" server stage--");
    }

    @Override
    public void registeringEvent(IEventBus eventBus) {
        LOGGER.info(ID+" register stage--");

    }
}
