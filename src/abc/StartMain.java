/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author niroth
 */
public class StartMain {
    public static void main(String[] args) {
        SliderObservable sliderObservable=new SliderObservable();
        sliderObservable.addSliderObserver(new SliderWindow("One", sliderObservable));
        sliderObservable.addSliderObserver(new SliderWindow("Two", sliderObservable));
        sliderObservable.addSliderObserver(new SliderWindow("Three", sliderObservable));
    }
}
