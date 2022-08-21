package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private static int CAR_COUNT;
    private List<Car> carList;

    {
        carList=new ArrayList<>();
        carList.add(new Car(++CAR_COUNT,"BMW","BLACK"));
        carList.add(new Car(++CAR_COUNT,"MERCEDES","RED"));
        carList.add(new Car(++CAR_COUNT,"LADA","YELLOW"));
        carList.add(new Car(++CAR_COUNT,"VOLVO","GREEN"));
        carList.add(new Car(++CAR_COUNT,"AUDI","WHITE"));
    }

    @Override
    public List<Car>index(int a){
        if(a>=5 || a==0){
        return carList;}
        return carList.subList(0, a);
    }

//    @Override
//    public List<Car> countCar(int id){
//        return carList.subList(0, id-1);
//    }

//    public Car countCar(int id){
//        return carList.stream().filter(car -> car.getId()==id).findAny().orElse(null);
//    }
}
