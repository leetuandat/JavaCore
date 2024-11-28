/**
 * @author X.e.n.g
 * @version 1.O
 * @project name: DEV2411LM-JAVA36
 * @date: 11/26/2024
 * @time: 08:21 PM
 * @package: Lab.Lab02
 */

package Lab.Lab02;

import java.util.Scanner;

public class Lab02_bth1 {
    public static class WeatherForecast {
        int status;

        public void setData() {
            System.out.println("Dragonfly weather forecast program");
            System.out.println("1. Low flying");
            System.out.println("2. High flying");
            System.out.println("3. Medium flying");
            System.out.println("4. Drunk as hell");
            System.out.println("Enter from 1 --> 4");

            Scanner input = new Scanner(System.in);
            status = input.nextInt();
            System.out.println("Thanks for entering");
        }

        public void DisplayForecast() {
            switch (status) {
                case 1:
                    System.out.println("Forecast: rainy weather, remember to bring a raincoat when going out");
                    break;

                case 2:
                    System.out.println("Forecast: sunny, remember to bring an umbrella!");
                    break;
                case 3:
                    System.out.println("Forecast: cloudy and cool.");
                    break;
                case 4:
                    System.out.println("Forecast: sorry, I was too drunk to reply.");
                    break;
                    default:
                        System.out.println("The dragonfly tried beep 404 times but without any success.");
            }
        }
    }

    public static void main(String[] args) {
        WeatherForecast forecast = new WeatherForecast();
        forecast.setData();
        forecast.DisplayForecast();
    }
}
