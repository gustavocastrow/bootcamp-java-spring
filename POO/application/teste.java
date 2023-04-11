//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public Program() {
    }

    public static void main(String[] var0) {
        Locale.setDefault(Locale.US);
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        double var2 = var1.nextDouble();
        double var4 = var1.nextDouble();
        double var6 = var1.nextDouble();
        System.out.println("Enter the measure of triangle Y: ");
        double var8 = var1.nextDouble();
        double var10 = var1.nextDouble();
        double var12 = var1.nextDouble();
        double var14 = (var2 + var4 + var6) / 2.0;
        double var16 = Math.sqrt(var14 * (var14 - var2) * (var14 - var4) * (var14 - var6));
        var14 = (var8 + var10 + var12) / 2.0;
        double var18 = Math.sqrt(var14 * (var14 - var8) * (var14 - var10) * (var14 - var12));
        System.out.printf("Triangle X area: %.4f%n", var16);
        System.out.printf("Triangle Y area: %.4f%n", var18);
        if (var16 > var18) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

        var1.close();
    }
}
