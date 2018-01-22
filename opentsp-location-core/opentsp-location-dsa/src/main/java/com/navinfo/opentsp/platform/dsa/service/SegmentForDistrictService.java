package com.navinfo.opentsp.platform.dsa.service;

import com.navinfo.opentsp.platform.dsa.service.interf.Dealer;
import com.navinfo.opentsp.platform.dsa.service.interf.SegmentForDistrict;
import com.navinfo.opentsp.platform.location.protocol.common.LCLocationData.LocationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class SegmentForDistrictService extends SegmentService {
    @Autowired
    private List<SegmentForDistrict> dealers;
    @Override
    public String getBatchSwitch() {
        return SGDISTRICTBATCHSWITCH;
    }

    @Override
    public String getPackagePath() {
        return SGDISTRICTPACKAGEPATH;
    }

    @Override
    protected Map<Long, List<LocationData>> getData(List<Long> tids, int segment) throws Exception {
        return rMIConnectCache.getLastLocationData(tids, 0);
    }

    public List<Dealer> getDealer() {
        List<Dealer> ds = new ArrayList<Dealer>();
        ds.addAll(dealers);
        return ds;
    }
}
