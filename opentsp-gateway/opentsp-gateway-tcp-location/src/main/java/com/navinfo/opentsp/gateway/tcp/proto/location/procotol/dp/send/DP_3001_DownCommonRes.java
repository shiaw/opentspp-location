package com.navinfo.opentsp.gateway.tcp.proto.location.procotol.dp.send;


import com.navinfo.opentsp.gateway.tcp.proto.location.pojo.PacketResult;
import com.navinfo.opentsp.gateway.tcp.proto.location.procotol.LocationCommand;
import com.navinfo.opentsp.platform.location.kit.Packet;
import com.navinfo.opentsp.gateway.tcp.proto.location.procotol.dp.DPCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
@LocationCommand(id = "3001")
public class DP_3001_DownCommonRes extends DPCommand {

	@Override
	public PacketResult processor(NettyClientConnection connection,Packet packet) {
		///this.write(packet);
		PacketResult packetResult=new PacketResult();
		packetResult.setTerminalPacket(packet);
		return packetResult;
	}
}
