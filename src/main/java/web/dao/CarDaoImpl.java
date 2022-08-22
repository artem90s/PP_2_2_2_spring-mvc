package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
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
}
