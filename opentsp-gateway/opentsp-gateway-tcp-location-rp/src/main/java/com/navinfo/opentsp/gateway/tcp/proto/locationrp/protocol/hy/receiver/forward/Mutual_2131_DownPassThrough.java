package com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.receiver.forward;

import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.LocationCommand;
import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.RPCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
import com.navinfo.opentsp.platform.location.kit.Packet;

/**
 * 数据下行透传
 */
@LocationCommand(id = "2131")
public class Mutual_2131_DownPassThrough extends RPCommand {

    @Override
    public Packet processor(NettyClientConnection connection, Packet packet) {
        //super.writeToTerminal(packet);
        super.writeMQToDP(packet);
        return null;
    }

}
