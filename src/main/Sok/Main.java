package src.main.Sok;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("pokr");
        Car car = context.getBean(Car.class);
        car.zv();// для масштаба
    }
}