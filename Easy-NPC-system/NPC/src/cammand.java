import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class cammand extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage("플러그인작동");
            return true;
        }
        else {
            sender.sendMessage("해당 명형어는 사용할 수 없습니다.");
            return false;
        }
    }
}