package org.example.ObserverPattern;
import java.util.ArrayList;
import java.util.List;

import org.example.ObserverPattern.Observer;
import org.example.ObserverPattern.Subject;

public class WeatherUpdate implements Subject {
  private List<Observer> observers;

  private float temperature;
  private float humidity;
  private float pressure;
  public WeatherUpdate(){
    this.observers = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer ele) {
    observers.add(ele);
  }

  @Override
  public void notifyObserver() {
  for(int i=0;i<observers.size();i++){
    observers.get(i).update(this.temperature, this.pressure, this.humidity);
  }
  }

  @Override
  public void removeObserver(Observer ele) {
    for(int i=0;i<observers.size();i++){
        observers.remove(ele);
    }
  }
  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }
}
