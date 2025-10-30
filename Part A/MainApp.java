package com.springdi.main;

import com.springdi.config.AppConfig;
import com.springdi.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageService service = context.getBean(MessageService.class);
        service.sendMessage("Hello from Spring Dependency Injection!");
        context.close();
    }
}
