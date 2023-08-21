package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class MessageService {
	
	@Value("${service.message}")
    private String serviceMessage;

    public String getMessage() {
        return serviceMessage;
    }

}
