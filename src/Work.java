import java.util.Scanner;

public class Work {
    //Herd herd_before;
    Herd herd_after;
    Shawarma shawa;
    Work() {
        //herd_before = new Herd();
        herd_after = new Herd();
        shawa = new Shawarma();
        herd_after.weight_herd();
    }
    void print_herds(){
        //herd_before.print_herd();
        System.out.println("Стадо в конце месяца");
        herd_after.print_herd();

    }
    void interFace(){
        int z = 0;
        do {
            double sum_m = 0;
            double sum_w = 0;
            for (int i = 0; i < herd_after.days; i++){
                if (shawa.getSum_meet() < 30){
                    Scanner scanner = new Scanner(System.in);
                    int a = scanner.nextInt();
                    for (int j = 0; j < herd_after.size; j++){
                        if (j == a){
                            sum_m = shawa.getSum_meet() + herd_after.herd[j].get_meet();
                            shawa.setSum_meet(sum_m);
                            sum_w = shawa.getSum_wool() + herd_after.herd[j].get_wool();
                            shawa.setSum_wool(sum_m);
                        }
                    }
                    herd_after.del_rum(a);
                }
                sum_m -= 30;
                shawa.setSum_meet(sum_m);
                System.out.println("вес мяса в шавухе: " + sum_m + "\nвес шерсти в шавухе: " + sum_w);
                if (i == herd_after.days){
                    z = 1;
                }
            }
        } while(z == 1);
    }
}
