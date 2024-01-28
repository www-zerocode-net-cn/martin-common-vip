package com.java2e.martin.common.vip.event;

import com.java2e.martin.common.vip.license.LicenseVerifyParam;
import org.springframework.context.ApplicationEvent;

/**
 * @author 狮少
 * @version 1.0
 * @date 2020/9/18
 * @describtion LicenceInstallEvent
 * @since 1.0
 */
public class LicenceInstallEvent extends ApplicationEvent {
    public LicenceInstallEvent(LicenseVerifyParam param) {
        super(param);
    }
}
