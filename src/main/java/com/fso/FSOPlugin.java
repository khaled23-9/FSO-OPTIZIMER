package com.fso;

import org.bukkit.plugin.java.JavaPlugin;

public class FSOPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // رسالة عند تشغيل البلقن
        getLogger().info("------------------------------------");
        getLogger().info("FSO-Adaptive-Optimizer has been enabled!");
        getLogger().info("Developer: khaled_jalal");
        getLogger().info("------------------------------------");
        
        // هنا سنقوم بتسجيل الأوامر لاحقاً
    }

    @Override
    public void onDisable() {
        getLogger().info("FSO-Adaptive-Optimizer has been disabled.");
    }
}