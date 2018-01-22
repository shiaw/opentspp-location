package com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.receiver.forward.travelrecorder;

import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.RPCommand;
import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.LocationCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
import com.navinfo.opentsp.platform.location.kit.Packet;

/**
 * 采集速度
 */
@LocationCommand(id = "2075")
public class RP_2075_TRSetCurrentDate extends RPCommand {

    @Override
    public Packet processor(NettyClientConnection connection, Packet packet) {
        super.writeToTerminal(packet);
        return null;
    }

}
