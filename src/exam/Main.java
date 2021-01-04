package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите вес (kg): ");
        float m = scanner.nextInt();//масса
        System.out.print("Введите рост (cm): ");
        float h = scanner.nextInt();//рост
        float hm = h/100;//формула высота в метрах
        float i = m/(hm*hm);//индекс массы тела(формула)
        System.out.print("ИМТ: "+i+"\n");
        if(i<=16){
            System.out.print("Выраженный дефицит массы тела\n");
        }
        else{
            if(i>16 && i<18.5){
                System.out.print("Недостаточная (дефицит) масса тела\n");
            }
            else{
                if(i>=18.5 && i<25){
                    System.out.print("Норма\n");
                }
                else{
                    if(i>=25&&i<30){
                        System.out.print("Избыточная масса тела (предожирение)\n");
                    }
                    else{
                        if(i>=30&&i<35){
                            System.out.print("Ожирение\n");
                        }
                        else{
                            if(i>=35&&i<40){
                                System.out.print("Ожирение резкое\n");
                            }
                            else{
                                if(i>=40){
                                    System.out.print("Очень резкое ожирение\n");
                                }
                            }
                        }
                    }
                }
            }
        }

        double normas = (h-110)*1.15;// формула для нахождения нормального веса по росту
        System.out.println("Идеальный вес: "+normas);
        double n = normas-m;//
        if(n>0){
            System.out.print("Вам необходимо набрать " + n + " кг до нормы\n");
        }
        if(n<0){
            n*=-1;
            System.out.print("Вам необходимо сбросить " + n + " кг до нормы\n");
        }

    }
}
