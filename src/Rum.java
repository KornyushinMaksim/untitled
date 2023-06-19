public class Rum {
    private double weight_meet;
    private double weight_wool;

    Rum(){
        weight_meet = Math.random() * 11 + 45;
        weight_wool = Math.random() * 6 + 10;
//        Double scale = Math.pow(10, 2);
//        weight_meet = Math.ceil(weight_meet * scale) / scale;
//        weight_wool = Math.ceil(weight_wool * scale) / scale;
    }
    Double get_meet(){
        return weight_meet;
    }
    Double get_wool(){
        return weight_wool;
    }
    void set_weight_meet(double value){
        weight_meet = value;
    }
    void set_weight_wool(double value){
        weight_wool = value;
    }
    void print_rum(int index) {
        System.out.print((index + 1) + "\t\t" + Math.ceil(weight_meet * 100) / 100 +
                "\t\t" + Math.ceil(weight_wool * 100) / 100);
    }
    void weight_gain_rum(){
            weight_meet += 1.00;
            weight_wool += 0.10;
    }

}
