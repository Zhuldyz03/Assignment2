package com.company;

public interface Observable {
    public void addObserver(Observer observer);

    public void notifyObservers();
}
