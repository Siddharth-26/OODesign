package org.example.ObserverPattern;

import org.example.ObserverPattern.Observer;

public interface Subject {
  public void registerObserver(Observer ele);
  public void notifyObserver();
  public void removeObserver(Observer ele);
}
