package muder.title;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;

public class MuderKill extends TitleBase {
	Player player;

	public MuderKill(Player player) {
		super(player);
		super.mes = "§cKILL MURDER";
		super.sub = "§6머더러를 사냥하셨습니다 §l+150P";
		this.player = player;
	}

	@Override
	public void send() {
		super.send();
	}
}
