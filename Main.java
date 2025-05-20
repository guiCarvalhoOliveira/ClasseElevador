public class Main {
    public static void main(String[] args) throws Exception {
        Elevador elevador = new Elevador(0, 4, 5, 0);
        
        elevador.setCapacidadeAtual(3);
        elevador.setAndarAtual(0);
        elevador.inicializar(0,0);
        
        
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.entrar();
        elevador.entrar();

        elevador.descer();
        elevador.descer();

        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();
        
        
        
    }
}
