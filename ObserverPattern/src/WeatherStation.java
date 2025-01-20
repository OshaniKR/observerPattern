//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData object (Concrete Subject)
        WeatherData weatherData = new WeatherData();

        // Create display elements (Observers) and register them with the WeatherData subject
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);


        // Simulate new weather measurements
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
