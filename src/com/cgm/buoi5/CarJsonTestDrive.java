/*
*  created date: Apr 26, 2022
*  author: cgm
*/
package com.cgm.buoi5;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CarJsonTestDrive {

    public static void main(String[] args) {
        Car car = new Car("100", 2022, "xanh");

        Car car2 = new Car("10", 2025, "tim");

        Car car3 = new Car("1", 2027, "do");

        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(car2);
        list.add(car3);

        Gson gson = new Gson();

        try (FileWriter fw = new FileWriter("cars.json")) {
            // code
            gson.toJson(list, fw);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
