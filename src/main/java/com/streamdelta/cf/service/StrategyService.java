package com.streamdelta.cf.service;
/*
 * Cagri.biyik 5/16/21
 */

import com.streamdelta.cf.strategy.BaseStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StrategyService {

    private final static Map<String, BaseStrategy> cmap = new HashMap<>();

    public void registerStrategy(String key, BaseStrategy strategy) {
        this.cmap.put(key, strategy);
    }

    public BaseStrategy getStrategy(String key) {
        return cmap.get(key);
    }
}
