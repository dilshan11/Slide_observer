/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.ArrayList;

/**
 *
 * @author niroth
 */
public class SliderObservable {
    private int sliderValue;
    private ArrayList<SliderObserver>observers=new ArrayList<>();
    public void addSliderObserver(SliderObserver sliderObserver){
        observers.add(sliderObserver);
    }
    public void removeSliderObserver(SliderObserver sliderObserver){
        observers.remove(sliderObserver);
    }    
    public void notifyObservers(){
        for (SliderObserver observer : observers) {
            observer.update(sliderValue);
        }
    }
    public void setSliderValue(int sliderValue){
        if(this.sliderValue!=sliderValue){
            this.sliderValue=sliderValue;
            notifyObservers();
        }
    }
}
