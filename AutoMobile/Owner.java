package AutoMobile;

class Owner extends Car{
    String Owner_Name;
    Owner(String Owner_Name,String Brand,String Model_Name){
        super(Brand,Model_Name);
        this.Owner_Name= Owner_Name;
    }
    void Display(){
        System.out.println("Owner Name: "+Owner_Name);
        System.out.println("Model Name: " + getModel_Name());
        System.out.println("Brand: "+Brand);
        System.out.println("Number Plate: "+ getNum());

    }



}