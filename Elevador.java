public class Elevador {
    private int andarAtual;
    private int totalAndar;
    private int capacidadeMax;
    private int capacidadeAtual;

    public Elevador(int andarAtual, int totalAndar, int capacidadeMax, int capacidadeAtual){
        this.andarAtual = andarAtual;
        this.totalAndar= totalAndar;
        this.capacidadeMax=capacidadeMax;
        this.capacidadeAtual=capacidadeAtual;
        
    }

                                public int getAndarAtual() {
                                    return andarAtual;
                                }

                                public void setAndarAtual(int andarAtual) {
                                    this.andarAtual = andarAtual;
                                }

                                public int getTotalAndar() {
                                    return totalAndar;
                                }

                                public void setTotalAndar(int totalAndar) {
                                    this.totalAndar = totalAndar;
                                }

                                public int getCapacidadeMax() {
                                    return capacidadeMax;
                                }

                                public void setCapacidadeMax(int capacidadeMax) {
                                    this.capacidadeMax = capacidadeMax;
                                }

                                public int getCapacidadeAtual() {
                                    return capacidadeAtual;
                                }

                                public void setCapacidadeAtual(int capacidadeAtual) {
                                    this.capacidadeAtual = capacidadeAtual;
                                }

    public void inicializar(int capacidadeAtual, int totalAndar){ 
        capacidadeAtual=0;
        andarAtual=0;
        System.out.println("\nO elevador esta funcionando");
      
    }
    public void entrar(){
        if (capacidadeAtual>=capacidadeMax){
            System.out.println("Capacidade máxima atingida");
        }else{
            System.out.println("Uma pessoa entrou");
        }
        capacidadeAtual++;
    }
    public void sair(){
        if(capacidadeAtual<=0){
            System.out.println("O elevador ja esta vazio");
        }else{
            System.out.println("Uma pessoa saiu");
        }
        capacidadeAtual--;
    }
    public void subir(){
        if(andarAtual>=totalAndar){
            System.out.println("O elevador chegou no andar mais alto");
        }else{
            System.out.println("O elevador subiu");
        }
        andarAtual++;
    }
    public void descer(){
        if(andarAtual>0){
            System.out.println("O elevador desceu");
        }else{
            System.out.println("O elevador não desce pra um andar negativo");
        }
        andarAtual--;
    }                            

    
}
