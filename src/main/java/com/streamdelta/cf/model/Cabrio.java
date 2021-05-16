package com.streamdelta.cf.model;
/*
 * Cagri.biyik 5/16/21
 */

import com.streamdelta.cf.service.StrategyService;
import com.streamdelta.cf.strategy.BaseStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Cabrio implements Car, BaseStrategy {

    private final static String type = "Cabrio";

    @Autowired
    private StrategyService strategyService;

    @Override
    public String getType() {
        return type;
    }

    @Override
    @PostConstruct
    public void register() {
        strategyService.registerStrategy(type, this);
    }
}
