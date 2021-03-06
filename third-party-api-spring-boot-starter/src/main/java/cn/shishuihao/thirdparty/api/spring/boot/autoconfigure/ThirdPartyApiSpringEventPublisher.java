package cn.shishuihao.thirdparty.api.spring.boot.autoconfigure;

import cn.shishuihao.thirdparty.api.core.event.EventPublisher;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.CompletableFuture;

/**
 * @author shishuihao
 * @version 1.0.0
 */

public class ThirdPartyApiSpringEventPublisher implements EventPublisher {
    private final ApplicationContext applicationContext;

    public ThirdPartyApiSpringEventPublisher(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void publishEvent(Object event) {
        CompletableFuture.runAsync(() -> applicationContext.publishEvent(event));
    }
}
