package com.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Pppppppppppp";
    }
}
