/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.ufpr.adapter;

/**
 *
 * @author User
 */
public class Adapter {

    public static void main(String[] args) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();

		AdapterTomada a = new AdapterTomada(t3);
		a.ligarNaTomadaDeDoisPinos();
    }
}
