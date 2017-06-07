package muder.title;

import cn.nukkit.Player;
import cn.nukkit.entity.EntityHuman;
import cn.nukkit.level.Location;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.nbt.tag.DoubleTag;
import cn.nukkit.nbt.tag.FloatTag;
import cn.nukkit.nbt.tag.ListTag;

public class BadInnoKill extends TitleBase {
	Player player;

	public BadInnoKill(Player player) {
		super(player);
		super.mes = "§c민간인 사살";
		super.sub = "§6당신은 영웅입니다. 일반인을 사냥하였습니다 §l-30P";
		this.player = player;
	}

	@Override
	public void send() {
		super.send();
		player.sleepOn(player.getPosition());

	}

}
