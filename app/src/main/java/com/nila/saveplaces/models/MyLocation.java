package com.nila.saveplaces.models;

import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class MyLocation {


  private   String placeName;
  private GeoPoint geo_point;
  private @ServerTimestamp
  Date timestamp;

  public String getPlaceName() {
    return placeName;
  }

  public MyLocation() {
  }

  public MyLocation(GeoPoint geo_point) {
    this.geo_point = geo_point;
  }

  public MyLocation(String placeName, GeoPoint geo_point) {
    this.placeName = placeName;
    this.geo_point = geo_point;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }

  public GeoPoint getGeo_point() {
    return geo_point;
  }

  public void setGeo_point(GeoPoint geo_point) {
    this.geo_point = geo_point;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
}
