package aron.vesselinfo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonPropertyOrder({ "date", "receivedDate", "latitude", "longitude", "speed" })	// same order as specified in the description
class Position {

  private @Id @GeneratedValue Long id;
  
  @JsonFormat(pattern="yyyy-MM-dd")
  private Date date;
  
  private Float latitude;
  private Float longitude;
  private Float speed;
  
  @JsonProperty("receivedDate")
  private LocalDate receivedDate = LocalDate.now();
  
  Position() {}

  public Date getDate() {
    return this.date;
  }
  
  public LocalDate getReceivedDate() {
	return this.receivedDate;
  }
  
  public Float getLatitude() {
	  return this.latitude;
  }
  
  public Float getLongitude() {
	  return this.longitude;
  }
  
  public Float getSpeed() {
	  return this.speed;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public void setReceivedTime(LocalDate receivedDate) {
	  this.receivedDate = receivedDate;
  }
  
  // Converting the input latitude&longitude(degrees) to radians
  public void setLatitude(Float latitude) {
	  this.latitude = (float) Math.toRadians(latitude);
  }
  
  public void setLongitude(Float longitude) {
	  this.longitude = (float) Math.toRadians(longitude);
  }
  
  
  // Converting the input(knots) to m/s
  public void setSpeed(Float speed) {
	  this.speed = (float) (speed * 0.514444);
  }
  
}