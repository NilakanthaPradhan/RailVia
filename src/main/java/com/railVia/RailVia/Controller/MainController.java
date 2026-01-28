package com.railVia.RailVia.Controller;


import com.railVia.RailVia.Model.TrainDetails;
import com.railVia.RailVia.Model.TrainStops;
import com.railVia.RailVia.Services.FindTrainService;
import io.micrometer.common.util.StringUtils;
import org.apache.coyote.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.CorsRegistry;

import java.util.List;

import javax.management.BadAttributeValueExpException;

@CrossOrigin(origins = "*")
@RestController
public class MainController {

private static final Logger logger= LoggerFactory.getLogger(MainController.class);

    @Autowired
    FindTrainService findTrainService;
    
  /*
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOrigins("*");
            }
        };
    }
*/


    @GetMapping("/check")
    public String checksMethod(){
        logger.info("testing this method is working fine");
        return "working fine";
    }
   @GetMapping("/getTrain")
   public ResponseEntity<TrainDetails> getTrainSchedule(@RequestBody TrainDetails trainDetails) throws BadRequestException {

       findTrainService.validate(trainDetails.getOrigin(),trainDetails.getDestination());
      
       
      return ResponseEntity.ok(findTrainService.getTrain(trainDetails));
       
   }
   
 
   @GetMapping("/{trainId}/stops")
   public List<TrainStops> getStops(@PathVariable Long trainId) {
       return findTrainService.getTrainStops(trainId);
   }

}
