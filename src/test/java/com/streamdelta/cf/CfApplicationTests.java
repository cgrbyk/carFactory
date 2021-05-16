package com.streamdelta.cf;

import com.streamdelta.cf.service.CarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CfApplicationTests {

    @Autowired
    private CarService carService;

    @Test
    void contextLoads() {
        assert carService.produceCar("Cabrio").equals("Cabrio Car has produced.");
        assert carService.produceCar("Cabrioa").equals("Car type Cabrioa not found.");
    }

}
