package com.streamdelta.cf.controller;
/*
 * Cagri.biyik 5/16/21
 */

import com.streamdelta.cf.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class CarController {

    private final static Logger logger = LoggerFactory.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/produceCar", method = RequestMethod.GET)
    public String getHash(@RequestParam String carType) {
        logger.info("request for produceCar");
        return carService.produceCar(carType);
    }
}
