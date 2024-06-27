package JavaBasic.Projects.EmployPayrolSystem;

class car
{
    private int carID;
    private String carModel,carBrand;
    private double carBasePrice;
    private boolean isAvailable;

    public car(int CarId,String CarModel, String CarBrand,double Baseprice)
    {
        this.carID=CarId;
        this.carModel=CarModel;
        this.carBrand=CarBrand;
        this.carBasePrice=Baseprice;
        this.isAvailable=true;
    }

    public int getCarID()
    {
        return carID;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public  String getCarBrand()
    {
        return carBrand;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void rent()
    {
        isAvailable =false;
    }

    public  void returnCar()
    {
        isAvailable=true;
    }

    public double calculatePrice(int day)
    {
        return day*carBasePrice;
    }
}

class customer
{
    private String name;
    private int customerId;
    public customer(String Name,int ID)
    {
        this.name=Name;
        this.customerId=ID;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public String getName()
    {
        return name;
    }
}

public class CarRentalSystem
{
}
