package com.workcloud.workcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "quickstart-provider")
public interface ProviderClient {

    /**
     * 调用服务的方法
     * @return
     */
    @GetMapping("/service")
    String service();
}
