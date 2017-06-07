package muder.title;

import cn.nukkit.Player;
import muder.Main;

public class InnoKill extends TitleBase {

	public InnoKill(Player player) {
		super(player);
		super.mes = "§c일반인 사냥 ";
		super.sub = "§6당신은 머더러 입니다. 일반인을 사냥하셨습니다 +50P";
		this.player = player;
	}

	@Override
	public void send() {
		super.send();
		int score = Main.score.get(player);
		score += 25;
		Main.score.replace(player, score);
	}
}
