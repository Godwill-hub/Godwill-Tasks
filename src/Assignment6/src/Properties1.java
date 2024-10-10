public class Properties1 {
    String Type_of_car;
    double CIF;
    int Seating_capacity;
    int Gross_weight;
    int Engine_capacity;
    int Age_of_car;
    String Plate_system;
    String delivery_mode;

        double ID =(0.25 * CIF);
        double VAT =(0.18 * CIF);
        double WHT =(0.06 * CIF);
        int IL = 150000;
        int SD = 35000;
        int FF = 20000;
        int ED = 200000;
        int APS = 300000;
        int DPS = 700000;
        int Bond_residence_per_day=15000;

    Properties1(String Type_of_car, int CIF, int Seating_capacity, int Gross_weight, int Engine_capacity, int Age_of_car, String Plate_system, String delivery_mode) {
        this.Type_of_car = Type_of_car;
        this.CIF = CIF;
        this.Seating_capacity = Seating_capacity;
        this.Gross_weight = Gross_weight;
        this.Engine_capacity = Engine_capacity;
        this.Age_of_car = Age_of_car;
        this.Plate_system = Plate_system;
        this.delivery_mode = delivery_mode;
    }
    //Ambulance
    public void displayAmbulance() {
        if (Type_of_car == "Ambulance") {
            System.out.println("ID=0, VAT=0, WHT=0");
        }
        if (Type_of_car == "Ambulance") {
            System.out.println("SD="+SD+","+"FF="+ FF+",ED:"+ED);
        }
        if (Age_of_car>10) {
            System.out.println("Il:"+(0.15*CIF));
        } else if (Age_of_car<10) {
            System.out.println("Il:"+IL);
        }
        if (delivery_mode == "carrier") {
            System.out.println("Road tolls tax:"+(0.05*CIF));
        } else if (delivery_mode == "driven") {
            System.out.println("Border fees tax:"+(0.015*CIF));
        }
    }
        //Estate
    public void displayEstate(){
        if (Type_of_car == "Estate") {
            System.out.println(ID+","+VAT+","+WHT+","+IL);
        }
        if (Type_of_car == "Estate") {
            System.out.println("SD="+SD+","+"FF="+ FF+",ED:"+ED);
        }
        if (Seating_capacity>5) {
            System.out.println("Seating capacity tax:"+(Seating_capacity-5)*250000);
        }
        if (Gross_weight>1500 && Gross_weight<2000) {
            System.out.println("Gross weight tax 1:"+(0.05*CIF));
        } else if (Gross_weight>2000) {
            System.out.println("Gross weight tax 2:"+(0.10*CIF));
        } else if (Gross_weight<1500) {
            System.out.println("Gross weight tax 3:"+(0.02*CIF));
        }
        if (Engine_capacity>1800) {
            System.out.println("Engine capacity tax 1:"+(0.05*CIF));
        } else if (Engine_capacity<1800) {
            System.out.println("Engine capacity tax 2:"+(0.025*CIF));
        }
        if (Age_of_car>1 && Age_of_car<5) {
            System.out.println("Age of car tax 1:"+(0.01*CIF+IL));
        } else if (Age_of_car>5 && Age_of_car<10) {
            System.out.println("Age of car tax 2:"+(0.05*CIF+IL));
        } else if (Age_of_car>10) {
            System.out.println("Age of car tax 3:"+(0.15*CIF+IL));
        }
        if (delivery_mode == "carrier") {
            System.out.println("Road tolls tax:"+(0.05*CIF));
        } else if (delivery_mode == "driven") {
            System.out.println("Border fees tax:"+(0.015*CIF));
        }
    }
    //Sedan
    public void displaySedan() {
        if (Type_of_car == "Sedan") {
            System.out.println(ID+","+VAT+","+WHT+","+IL);
        }
        if (Type_of_car == "Sedan") {
            System.out.println("SD="+SD+","+"FF="+ FF+",ED:"+ED);
        }
        if (Type_of_car=="Sedan") {
            System.out.println("Capacity tax:"+0);
        }
        if (Gross_weight>1500 && Gross_weight<2000) {
            System.out.println("Gross weight tax 1:"+(0.10*CIF));
        } else if (Gross_weight>2000) {
            System.out.println("Gross weight tax 2:"+(0.15*CIF));
        } else if (Gross_weight<1500) {
            System.out.println("Gross weight tax 3:"+(0.02*CIF));
        }
        if (Engine_capacity>2000) {
            System.out.println("Engine capacity tax 1:"+(0.10*CIF));
        } else if (Engine_capacity>1500 && Engine_capacity<2000) {
            System.out.println("Engine capacity tax 2:"+(0.05*CIF));
        } else if (Engine_capacity<1500) {
            System.out.println("Engine capacity tax 3:"+(0.025*CIF));
        }
        if (Age_of_car>15) {
            System.out.println("Car age:Cannot be imported");
        }
        else if (Age_of_car>10 && Age_of_car<15) {
            System.out.println("Age of car tax 1:"+(0.10*CIF+IL));
        } else if (Age_of_car>5 && Age_of_car<10) {
            System.out.println("Age of car tax 2:"+(0.05*CIF+IL));
        } else if (Age_of_car<5) {
            System.out.println("Age of car tax 3:"+(0.015*CIF+IL));
        }
        if (delivery_mode == "carrier") {
            System.out.println("Road tolls tax:"+(0.05*CIF));
        } else if (delivery_mode == "driven") {
            System.out.println("Border fees tax:"+(0.015*CIF));
        }
    }
    //SUV
    public void displaySUV() {
        if (Type_of_car == "SUV") {
            System.out.println(ID + "," + VAT + "," + WHT + "," + IL);
        }
        if (Type_of_car == "SUV") {
            System.out.println("SD=" + SD + "," + "FF=" + FF + ",ED:" + ED);
        }
        if (Seating_capacity > 5) {
            System.out.println("Seating capacity:Dont pay anything");
        }
        if (Gross_weight > 5000) {
            System.out.println("Gross weight tax 1:" + (0.15 * CIF));
        } else if (Gross_weight < 5000) {
            System.out.print("Gross weight tax:Dont pay anything");
        }
        if (Type_of_car == "SUV") {
            System.out.println("Engine capacity tax:Don't pay");
        }
        if (Age_of_car > 1 && Age_of_car < 5) {
            System.out.println("Age of car tax 1:" + (0.01 * CIF + IL));
        } else if (Age_of_car > 5 && Age_of_car < 10) {
            System.out.println("Age of car tax 2:" + (0.15 * CIF + IL));
        } else if (Age_of_car > 10) {
            System.out.println("Age of car tax 3:" + (0.25 * CIF + IL));
        }
        if (delivery_mode == "carrier") {
            System.out.println("Road tolls tax:"+(0.05*CIF));
        } else if (delivery_mode == "driven") {
            System.out.println("Border fees tax:"+(0.015*CIF));
        }
    }
        //Trailer
        public void displayTrailer() {
            if (Type_of_car == "Trailer") {
                System.out.println(ID + "," + VAT + "," + WHT + "," + IL);
            }
            if (Type_of_car == "Trailer") {
                System.out.println("SD=" + SD + "," + "FF=" + FF + ",ED:" + ED);
            }
            if (Type_of_car == "Trailer") {
                System.out.println("Seating capacity:Dont pay");
            }
            if (Gross_weight > 15000 && Gross_weight < 20000) {
                System.out.println("Gross weight tax 1:" + (0.15 * CIF));
            } else if (Gross_weight > 20000) {
                System.out.println("Gross weight tax 2:" + (0.25 * CIF));
            } else if (Gross_weight < 20000 && Gross_weight < 15000) {
                System.out.print("Gross weight tax 3:" + 0.05 * CIF);
            }
            if (Engine_capacity > 20000) {
                System.out.println("Engine capacity tax 1:" + (0.10 * CIF));
            } else if (Engine_capacity > 15000 && Engine_capacity < 20000) {
                System.out.println("Engine capacity tax 2:" + (0.05 * CIF));
            } else if (Engine_capacity < 15000) {
                System.out.println("Engine capacity tax 3:" + (0.025 * CIF));
            }
            if (Age_of_car > 15) {
                System.out.println("Age of car:Cannot be imported");
            } else if (Age_of_car > 10 && Age_of_car < 15) {
                System.out.println("Age of car tax 1:" + (0.10 * CIF + IL));
            } else if (Age_of_car > 5 && Age_of_car < 10) {
                System.out.println("Age of car tax 2:" + (0.05 * CIF + IL));
            } else if (Age_of_car < 5) {
                System.out.print("Age of car tax 3:" + (0.015 * CIF + IL));
            }
            if (delivery_mode == "carrier") {
                System.out.println("Road tolls tax:"+(0.05*CIF));
            } else if (delivery_mode == "driven") {
                System.out.println("Border fees tax:"+(0.015*CIF));
            }
        }
        //Bond fees
        public void displayBondfees(){
            System.out.println("Bond fees:"+Bond_residence_per_day+"per day");
        }
    }

