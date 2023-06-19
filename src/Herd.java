public class Herd {
    int size, days;
    Rum[] herd;

    Herd(){
        size = 10;
        days = 30;
        herd = new Rum[size];
        for (int i = 0; i < size; i++) {
            herd[i] = new Rum();
        }
    }
    Herd(Herd obj){
        this.size = obj.size;
        this.days = obj.days;
        this.herd = obj.herd;
    }
    void setDays(int value){
        days = value;
    }
    void weight_herd(){
        for (int i = 1; i <= days; i++) {
            for (int j = 0; j < herd.length; j++) {
                //herd[j].set_weight_meet(herd[j].get_meet() + 1.0);
                //herd[j].set_weight_wool(herd[j].get_wool() + 1.0);
                herd[j].weight_gain_rum();
            }
            if (i % 5 == 0) {
                add_rum();
            }
        }

    }
    void print_herd() {
        System.out.println("Номер\tВес мяса\tВес шерсти");
        for (int i = 0; i < size; i++) {
            herd[i].print_rum(i);
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    void add_rum() {
        Rum[] new_herd = new Rum[size + 1];
        for (int i = 0; i < size; i++) {
            new_herd[i] = herd[i];
        }
        new_herd[size] = new Rum();
        herd = new_herd;
        size++;
    }

    void del_rum(int index){
        Rum[] new_herd = new Rum[size - 1];
        for (int i = 0, j = 0; i < size - 1; i++, j++){
            if (i == index - 1){
                new_herd[i] = herd[++j];
            }
            else {
                new_herd[i] = herd[j];
            }
        }
        herd = new_herd;
        size--;
    }

}
