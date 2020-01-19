package com.srv.tsukinome.actuator;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: saurabh vaish
 * @version: 1.0
 * @since : 19-Jan-20
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class RefreshController {
}
