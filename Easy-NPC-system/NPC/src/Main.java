import org.bukkit.plugin.java.JavaPlugin;

public  class Main extends JavaPlugin{
    @Override
    public void onEnable() {
        getLogger().info("플러그인이 활성화되었습니다.");
        getCommand("test").setExecutor(new cammand());
    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인이 비활성화되었습니다.");
    }
}