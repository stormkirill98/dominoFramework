package com.project;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.api.client.ClientApp;

import java.util.logging.Logger;

public class AppClientModule implements EntryPoint {

    private static final Logger LOGGER = Logger.getLogger(AppClientModule.class.getName());

    public void onModuleLoad() {
        ClientApp.make().run();
        LOGGER.info("dominoFramework Application frontend have been initialized.");
    }
}
