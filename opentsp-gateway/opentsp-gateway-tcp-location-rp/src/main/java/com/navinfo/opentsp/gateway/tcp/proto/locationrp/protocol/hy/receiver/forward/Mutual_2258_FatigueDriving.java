package com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.receiver.forward;

import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.RPCommand;
import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.LocationCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
import com.navinfo.opentsp.platform.location.kit.Packet;

/**
 * 疲劳驾驶报警
 */
@LocationCommand(id = "2258")
public class Mutual_2258_FatigueDriving extends RPCommand {

    @Override
    public Packet processor(NettyClientConnection connection, Packet packet) {
        super.writeToTerminal(packet);
        return null;
    }

}
