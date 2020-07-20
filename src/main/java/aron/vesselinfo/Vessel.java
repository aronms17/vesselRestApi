package aron.vesselinfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


// I could've used Lombok to avoid repetitive code in getters and setters:
// https://projectlombok.org/
// But for this project i´ll do it the old fashioned way

@Entity
class Vessel {

  private @Id @GeneratedValue Long id;
  private String name;
  private String country;
 
  Vessel() {}
  
  public String getName() {
    return this.name;
  }

  // JSON serialization
  //Don´t want to return this field in the return format
  @JsonIgnore
  @JsonProperty(value = "country")
  public String getcountry() {
    return this.country;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  public void setCountry(String country) {
    this.country = country;
  }
  
}