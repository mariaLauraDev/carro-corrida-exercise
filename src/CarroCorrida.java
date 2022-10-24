public class CarroCorrida {

    private Integer numeroCarro;
    private Piloto piloto;
    private Float velocidadeMaxima;
    private Float velocidadeAtual;
    private boolean ligado;

    public CarroCorrida(Integer numeroCarro,
                        Piloto piloto,
                        Float velocidadeMaxima,
                        Float velocidadeAtual,
                        boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public Float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setVelocidadeMaxima(Float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(Float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
        System.out.printf("Carro da %s ligado\n", getPiloto().getNome());
    }

    public void acelerar(Float aumenta, Float velocidadeAtual){

        if (isLigado()){
            if ((velocidadeAtual + aumenta)>(getVelocidadeMaxima())){
                this.velocidadeAtual = getVelocidadeMaxima();
                System.out.printf("A velocidade máxima foi ultrapassada. %s, você está no limite.Velocidade atual  %.1f. \n",getPiloto().getNome(),this.velocidadeAtual);

            } else {
                this.velocidadeAtual = velocidadeAtual + aumenta;
                System.out.printf("Velocidade atual da %s: %.1f\n",getPiloto().getNome(),this.velocidadeAtual);
            }
        } else {
            System.out.println("Primeiro, ligue o carro.");
        }

    }

    public void frear(Float diminui, Float velocidadeAtual){

        if (isLigado()){
            if ((velocidadeAtual - diminui)<0){
                System.out.println("Não é possível frear para velocidades negativas");
            } else {
                this.velocidadeAtual = velocidadeAtual - diminui;
                System.out.printf("Velocidade atual da %s: %.1f\n",getPiloto().getNome(),this.velocidadeAtual);
            }
        } else {
            System.out.println("Primeiro, ligue o carro.");
        }

    }

    public void parar(Float velocidadeAtual){

        if (isLigado()){
            this.velocidadeAtual = 0.0F;
        } else {
            System.out.println("O carro já está parado, pois está desligado :)");
        }
    }

    public void desligar(){
        if (isLigado()){
            if (getVelocidadeAtual()==0.0){
                setLigado(false);
                System.out.printf("Carro da %s desligado\n", getPiloto().getNome());
            } else {
                System.out.printf("%s, você precisa parar o carro primeiro.\n",getPiloto().getNome());
            }
        } else {
            System.out.println("O carro já está desligado :)");
        }
    }

    @Override
    public String toString() {
        return "CarroCorrida{" +
                "numeroCarro=" + numeroCarro +
                ", piloto=" + piloto +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", ligado=" + ligado +
                '}';
    }
}
