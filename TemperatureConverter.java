public class TemperatureConverter {
  public static void main (String args[]) {  
    convertToCelcius();
    converToFarenhite();
  }
  
  public static void converToCelcius() {
    double fahrenheit = 43;  
    double celsius  = ((fahrenheit-32)*5)/9;  
    System.out.println("Temperature in celsius: "+celsius);  
  }
  
  public static void converToFarenhite() {
    double celcius = 27;  
    double farenhite  = ((celsius*9)/5)+32;
    System.out.println("Temperature in farenhite: "+farenhite);  
  }
}
