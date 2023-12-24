package com.skoow.cuprumox.api;

import com.mojang.logging.LogUtils;
import com.skoow.cuprumox.Cuprumox;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.UUID;

public abstract class CuprumoxMod {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String ID = "CUPRUMOXUNDEFINED";
    public CuprumoxMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        registeringEvent(eventBus);
        eventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    public abstract void commonSetupEvent(final FMLCommonSetupEvent event);
    public abstract void serverStartEvent(final ServerStartingEvent event);
    public abstract void registeringEvent(final IEventBus eventBus);



    private void commonSetup(final FMLCommonSetupEvent event)
    {
        commonSetupEvent(event);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        serverStartEvent(event);
    }
}
