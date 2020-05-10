package com.xyniac.demo.conf;

import com.xyniac.abstractconfig.AbstractDynamicConfig;
import scala.Option;

public class ServerConfig extends AbstractDynamicConfig {
    private static final ServerConfig serverConfig = new ServerConfig();
    public static ServerConfig getInstance() {
        return serverConfig;
    }
    public String getName(){
        return this.getProperty("name", String.class, Option.empty());
    }
}
