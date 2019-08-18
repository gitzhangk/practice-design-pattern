package main.java.designpattern.statepattern.service;

import main.java.designpattern.statepattern.service.impl.Context;

public interface State {
   public void doAction(Context context);
}
