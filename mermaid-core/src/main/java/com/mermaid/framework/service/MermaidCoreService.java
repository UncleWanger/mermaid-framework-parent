package com.mermaid.framework.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desription:
 *
 * @author:Hui CreateDate:2018/8/25 21:20
 * version 1.0
 */
@FeignClient(name = "mermaid-core")
public interface MermaidCoreService {

    @RequestMapping("/test")
    String test();
}
