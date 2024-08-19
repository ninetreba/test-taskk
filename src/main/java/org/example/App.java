package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main( String[] args ) {

        PlacesInit placesInit = new PlacesInit();
        List<Note> places = placesInit.index();

        Collections.sort(places, Collections.reverseOrder(Note.COMPARE_BY_IMPORTANT));

        final double HOURS_PER_DAY = 16.0;
        final int DAY_HOLIDAY = 2;


        for (int i =0; i < DAY_HOLIDAY; i++) {
            List<Note> optimal = new ArrayList<>();
            double hoursOstalos = HOURS_PER_DAY;


            for (int j = 0; j < places.size(); j++) {

                for (int k = 0; k < places.size(); k++) {
                    if (places.get(k).getTimeSpend() > hoursOstalos) {
                        continue;
                    }

                    hoursOstalos = hoursOstalos - places.get(k).getTimeSpend();
                    optimal.add(places.get(k));
                    places.remove(k);
                    break;
                }

            }


            System.out.println("the optimal route in the " + (i+1) + " day is ");
            System.out.println(optimal.toString());

        }


    }




}
