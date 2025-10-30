package com.banking.main;

import com.banking.config.AppConfig;
import com.banking.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankService bankService = context.getBean(BankService.class);
        bankService.transfer(1, 2, 2000);

        context.close();
    }
}
