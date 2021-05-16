package com.streamdelta.cf.service;
/*
 * Cagri.biyik 5/16/21
 */

import com.streamdelta.cf.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final static Logger logger = LoggerFactory.getLogger(CarService.class);

    @Autowired
    private StrategyService strategyService;

    public String produceCar(String type) {
        Car car = (Car) strategyService.getStrategy(type);
        String result;
        if (car != null) {
            result = String.format("%s Car has produced.", car.getType());
            logger.info(result);
        } else {
            result = String.format("Car type %s not found.", type);
            logger.warn(result, type);
        }
        return result;
    }
}
