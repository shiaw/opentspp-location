package com.navinfo.opentsp.platform.dp.core.acceptor.rp.receiver;

import com.navinfo.opentsp.platform.dp.core.handler.RPAnno;
import com.navinfo.opentsp.platform.location.protocol.common.LCAllCommands.AllCommands;
import com.navinfo.opentsp.platform.dp.core.acceptor.rp.RPCommand;
import com.navinfo.opentsp.platform.location.kit.Packet;

@RPAnno(id="2160")
public class RP_2160_AskQuestion extends RPCommand {

	@Override
	public int processor(Packet packet) {
		packet.setTo(packet.getFrom());
		super.writeToTermianl(packet);
		super.terminalOperateLog(packet.getFrom(), AllCommands.Terminal.AskQuestion_VALUE, packet.getContent());
		return 0;
	}

}
