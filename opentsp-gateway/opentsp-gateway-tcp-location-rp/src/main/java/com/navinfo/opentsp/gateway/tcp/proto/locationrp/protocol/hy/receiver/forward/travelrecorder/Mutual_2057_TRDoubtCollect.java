package com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.receiver.forward.travelrecorder;

import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.LocationCommand;
import com.navinfo.opentsp.gateway.tcp.proto.locationrp.protocol.hy.RPCommand;
import com.navinfo.opentsp.gateway.tcp.server.NettyClientConnection;
import com.navinfo.opentsp.platform.location.kit.Packet;

/**
 * 采集当前驾驶员信息
 */
@LocationCommand(id = "2057")
public class Mutual_2057_TRDoubtCollect extends RPCommand {

    @Override
    public Packet processor(NettyClientConnection connection, Packet packet) {
        super.writeToTerminal(packet);
        return null;
    }

}
