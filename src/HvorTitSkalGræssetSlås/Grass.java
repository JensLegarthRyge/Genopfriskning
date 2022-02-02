package HvorTitSkalGræssetSlås;

import java.util.Scanner;

public class Grass {
    public static void main(String[] args) {
        double currentGrassLength;
        double maxGrassLength;
        System.out.println("Indtast græssets længde: ");
        currentGrassLength=getUserInput();
        System.out.println("Indtast hvor langt græsset må blive: ");
        maxGrassLength=getUserInput();
        System.out.println(whenToCutGrass(currentGrassLength, maxGrassLength));

    }
    public static int whenToCutGrass(double currentGrassLength, double maxGrassLength){
        int daysUntilGrassCutting=0;
        while(currentGrassLength<maxGrassLength){
            daysUntilGrassCutting++;
            currentGrassLength+=0.8;
        }
        return daysUntilGrassCutting;
    }

    public static double getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
