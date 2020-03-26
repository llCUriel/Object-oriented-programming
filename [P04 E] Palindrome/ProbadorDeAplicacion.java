import java.util.Stack;

public class ProbadorDeAplicacion {

    private Mensaje msj;

    public ProbadorDeAplicacion(String str) {
        msj = new Mensaje(str);
    }

    public ProbadorDeAplicacion() {
        msj = null;
    }

    public void setMsj(Mensaje msj) {
        this.msj = msj;
    }

    protected void finalize() {
        msj = null;
        System.gc();
    }

    public void probarApp() {
        Mensaje msj2 = new Mensaje();
        String str = " es palindromo";
        if (verificarPalindromo(msj)) {
            msj2.setMensaje("Sí " + str);
        } else {
            msj2.setMensaje("No " + str);
        }
        msj2.mostrarMensaje();
    }

    public boolean verificarPalindromo(Mensaje msj) {
        Stack s1, s2;
        s1 = llenarPila(msj.getMensaje());
        s2 = invertirPila(s1);
        return verificarIgualdad(s1, s2);
    }

    public Stack invertirPila(Stack s1) {
        Stack s2 = new Stack();
        Stack s3 = (Stack) s1.clone();
        while (s3.isEmpty() == false) {
            s2.push(s3.pop());
        }
        return s2;
    }

    public Stack llenarPila(String str) {
        Stack aux = new Stack();
        char[] ch = str.toCharArray();
        for (int j = 0; j < str.length(); j++) {
            aux.push(ch[j]);
        }
        return aux;
    }

    public boolean verificarIgualdad(Stack s1, Stack s2) {
        boolean bandera = true;
        if (s1.size() != s2.size()) {
            return false;
        } else {
            while (s1.empty() == false) {
                if (s1.peek() == s2.peek()) {
                    s1.pop();
                    s2.pop();
                } else {
                    bandera = false;
                }

            }
        }
        return bandera;
    }
}
