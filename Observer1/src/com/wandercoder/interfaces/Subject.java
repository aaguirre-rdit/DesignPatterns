package com.wandercoder.interfaces;

public interface Subject{
    public void register(Observer observer);
    public void unregister(Observer observer);

    public void notifyObservers();

    public Object getUpdate();
}