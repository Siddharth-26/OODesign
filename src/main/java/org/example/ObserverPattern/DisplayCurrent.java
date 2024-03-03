package org.example.ObserverPattern;

public class DisplayCurrent implements Observer {
  private float temperature;
  private float humidity;
  private float pressure;

  @Override
  public void update(float temperature, float pressure, float humidity) {
    this.humidity = humidity;
    this.pressure = pressure;
    this.temperature = temperature;
  }
}
