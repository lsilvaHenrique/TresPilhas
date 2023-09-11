package view;

import java.util.Stack;

public class Principal {
    
	public static void exibePilha(Stack<Integer> p1, Stack<Integer> p2, Stack<Integer> p3) {
        Stack<Integer> A1 = new Stack<>();
        Stack<Integer> A2 = new Stack<>();

        // Passo 2: Move elementos de P1 e P2 para A1
        while (!p1.isEmpty() && !p2.isEmpty()) {
            A1.push(p1.pop());
            A1.push(p2.pop());
        }

        // Passo 3: Move elementos de P3 para A1
        while (!p3.isEmpty()) {
            A1.push(p3.pop());
        }

        // Passo 4: Move elementos de A1 para A2
        while (!A1.isEmpty()) {
            A2.push(A1.pop());
        }

        // Passo 5: Exibe elementos de A2
        for (int i = 0; i < 4; i++) {
            if (!A2.isEmpty()) {
                int elemento = A2.pop();
                System.out.println("Elemento: " + elemento);
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        p1.push(10);
        p1.push(25);
        p1.push(30);
        p1.push(40);

        Stack<Integer> p2 = new Stack<>();
        p2.push(15);
        p2.push(25);
        p2.push(60);
        p2.push(34);

        Stack<Integer> p3 = new Stack<>();
        p3.push(35);
        p3.push(20);

        exibePilha(p1, p2, p3); 
        /*Ficara exibido no console: Elemento: 40; Elemento: 34; Elemento: 30; Elemento: 60. 
         * E as pilhas ficarao vazias  */
    }
}



