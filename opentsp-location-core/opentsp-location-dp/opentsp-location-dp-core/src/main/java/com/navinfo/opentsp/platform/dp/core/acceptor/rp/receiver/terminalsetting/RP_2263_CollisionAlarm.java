package com.navinfo.opentsp.platform.dp.core.acceptor.rp.receiver.terminalsetting;

import com.navinfo.opentsp.platform.dp.core.handler.RPAnno;
import com.navinfo.opentsp.platform.location.protocol.common.LCAllCommands.AllCommands;
import com.navinfo.opentsp.platform.dp.core.acceptor.rp.RPCommand;
import com.navinfo.opentsp.platform.dp.core.cache.entity.SettingParameterEntry;
import com.navinfo.opentsp.platform.location.kit.Convert;
import com.navinfo.opentsp.platform.location.kit.Packet;

@RPAnno(id="2263")
public class RP_2263_CollisionAlarm  extends RPCommand {

	@Override
	public int processor(Packet packet) {
		SettingParameterEntry parameterEntry = new SettingParameterEntry();
		parameterEntry.setCommandCode(AllCommands.Terminal.CollisionAlarm_VALUE);
		parameterEntry.setTerminalId(Convert.uniqueMarkToLong(packet.getUniqueMark()));
		parameterEntry.setParaContent(packet.getContent());
//		TerminalParameterCache.getInstance().add(packet.getUniqueMark(), packet.getSerialNumber(), parameterEntry);
		super.terminalOperateLog(parameterEntry.getTerminalId(), AllCommands.Terminal.CollisionAlarm_VALUE, packet.getContent());
		packet.setTo(packet.getFrom());
		super.writeToTermianl(packet);
		return 0;
	}

}