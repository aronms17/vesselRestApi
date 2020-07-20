package aron.vesselinfo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class VesselController {
  
  @PostMapping("/Vessel")
  public ResponseEntity<RequestWrapper> vesselInfo(@RequestBody RequestWrapper newWrapper) {
	  
	  return new ResponseEntity<RequestWrapper>(newWrapper, HttpStatus.OK);
  }
  
}