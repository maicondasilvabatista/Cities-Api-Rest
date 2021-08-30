package com.digitalinnovationone.citiesapi.distances.resource;

import com.digitalinnovationone.citiesapi.distances.service.DistanceService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/distances")
@RequiredArgsConstructor
public class DistanceResource {

    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    private final DistanceService distanceService;

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
                                   @RequestParam(name = "to")final Long city2){
        log.info("byPoints");
        return ResponseEntity.ok().body(distanceService.distanceByPointsInMiles(city1,city2));
    }

    @GetMapping("/by-cube")
    public ResponseEntity byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2){
        log.info("byCube");
        return ResponseEntity.ok().body(distanceService.distanceByCubeInMeters(city1,city2));
    }

//    @GetMapping("/by-math")
//    public Double byMath(@RequestParam(name = "from") final Long city1,
//                         @RequestParam(name = "to") final Long city2,
//                         @RequestParam final EarthRadius unit){
//        log.info("byMath");
//        return distanceService.distanceUsingMath(city1,city2,unit);
//    }
}
