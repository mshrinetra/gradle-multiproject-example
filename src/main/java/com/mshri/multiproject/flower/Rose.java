package com.mshri.multiproject.flower;

import com.mshri.multiproject.common.Config;
import com.mshri.multiproject.common.Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rose {

    // For logging
    private static final Logger log = LogManager.getLogger(Rose.class);
    
    public static void main(String[] args) {
        log.info("Started Rose...");
        System.out.println("In :flower.Rose");
        Utils.pack(Config.getProperty("Rose"));
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("Args in Rose: " + arg);
            }
        }
        Petal.printPetalOf("Rose");
        // Utils.holdConsole();
        log.info("Rose complete.");
    }
}
