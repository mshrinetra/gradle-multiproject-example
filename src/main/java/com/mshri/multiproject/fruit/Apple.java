package com.mshri.multiproject.fruit;

import com.mshri.multiproject.common.Config;
import com.mshri.multiproject.common.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Apple {

    // For logging
    private static final Logger log = LogManager.getLogger(Apple.class);
    
    public static void main(String[] args) {
        log.info("Apple started...");
        System.out.println("In :fruit.Apple");
        Utils.pack(Config.getProperty("Apple"));
        Juice.printJuiceOf("Apple");
        // Utils.holdConsole();
        log.info("Apple complete.");
    }
}
