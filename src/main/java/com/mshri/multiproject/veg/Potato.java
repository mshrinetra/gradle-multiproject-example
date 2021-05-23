package com.mshri.multiproject.veg;

import com.mshri.multiproject.common.Config;
import com.mshri.multiproject.common.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Potato {
    
    // For logging
    private static final Logger log = LogManager.getLogger(Potato.class);
  
    public static void main(String[] args) {
        log.info("Potato started...");
        System.out.println("In :veg.Potato");
        Utils.pack(Config.getProperty("Potato"));
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("Args in Rose: " + arg);
            }
        }
        Chips.printChipsOf("Potato");
        // Utils.holdConsole();
        log.info("Potato complete.");
    }
}
