package fr.benicos.kasper;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Lancement de Kasper...");


    }

    @Override
    public void onDisable() {
        System.out.println("Arrêt de Kasper...");
    }
}
