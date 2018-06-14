package com.tinker.myapplication;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author lys
 * @time 2018/6/13 14:35
 * @desc:
 */

public class MyApplicaion extends TinkerApplication {
    public MyApplicaion() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.tinker.myapplication.MyApplicationLiker",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
