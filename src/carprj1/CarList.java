package carprj1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class CarList extends ArrayList<Car> {

    private final ArrayList<Car> carlist = new ArrayList<>();
    private BrandList brandList;

    public CarList(BrandList brandList) {
        this.brandList = brandList;
    }

    public boolean loadFromFile(String txt) {

        return true;
    }

    public boolean saveToFile(String txt) {
        return true;

    }

    public int searchID(String ID) {

        for (int i = 0; i < carlist.size(); i++) {
            if (this.get(i).getCarID() == ID) {
                return i;
            }
        }
        return -1;

    }

    public int searchFrame(String fID) {

        for (int i = 0; i < carlist.size(); i++) {
            if (this.get(i).getFrameID() == fID) {
                return i;
            }
        }
        return -1;

    }

    public int searchEngine(String eID) {

        for (int i = 0; i < carlist.size(); i++) {
            if (this.get(i).getEngineID() == eID) {
                return i;
            }
        }
        return -1;

    }

    public boolean removeCar(String ID) {

        int pos = searchID(ID);

        if (pos < 0) {
            System.out.println("not found");
            return false;

        } else {
            carlist.remove(pos);
        }

        return true;
    }

    public void  listCars(String ID) {
        Collections.sort(this);
        for (int i = 0; i < carlist.size(); i++) {
            Car c = this.get(i);
            System.out.println(c.screenString());
        }
        
    }

}
