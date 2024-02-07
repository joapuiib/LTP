package exercicis.genericitat.matriz;

public class UseMatriz {
    public static void main(String[] args) {
        Matriz<Integer> m = new Matriz<>(4, 2);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                m.set(i, j, 2*i + j + 1);
            }
        }
        System.out.println(m);
        System.out.println(m.get(0, 1));
    }
}
