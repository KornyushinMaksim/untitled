public class Shawarma {
    private double sum_meet;
    private double sum_wool;
    private double number_rum;
    private Rum rum;
    Shawarma(){
        sum_meet = 0;
        sum_wool = 0;
        number_rum = 0;
    }
    void setNumber_rum(int index){
        number_rum = index;
    }
    double getSum_meet() {
        return sum_meet;
    }

    double getSum_wool(){
        return sum_wool;
    }

    void setSum_meet(double value){
        sum_meet = value;
    }
    void setSum_wool(double value){
        sum_wool = value;
    }
//    void choiceRum(int number_rum, Herd obj){
//        for (int i = 0; i < rum)
//    }
}
