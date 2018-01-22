package com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.receiver.forward.travelrecorder;

import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.RPCommand;
import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.LocationCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
import com.navinfo.opentsp.platform.location.kit.Packet;

/**
 * 设置记录仪时间
 */
@LocationCommand(id = "2072")
public class RP_2072_TRSetVehicleInfo extends RPCommand {

    @Override
    public Packet processor(NettyClientConnection connection, Packet packet) {
        super.writeToTerminal(packet);
        return null;
    }

}
