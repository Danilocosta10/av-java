public class Main {
    public static void main(String[] args) {
                Subclasse objetoSubclasse = new Subclasse("Valor Subclasse", 10);

               System.out.println("Valor da superclasse: " + objetoSubclasse.getValorSuperclasse());
        System.out.println("Valor da subclasse: " + objetoSubclasse.getValorSubclasse());
        objetoSubclasse.metodoSuperclasse();
        objetoSubclasse.metodoSubclasse();

                Superclasse objetoSuperclasse = new Superclasse("Valor Super");

        System.out.println("Valor da superclasse: " + objetoSuperclasse.getValorSuperclasse());
        objetoSuperclasse.metodoSuperclasse();
    }
}

class Superclasse {
    private String valorSuperclasse;

      public Superclasse(String valorSuperclasse) {
        this.valorSuperclasse = valorSuperclasse;
    }

        public String getValorSuperclasse() {
        return valorSuperclasse;
    }

        public void setValorSuperclasse(String valorSuperclasse) {
        this.valorSuperclasse = valorSuperclasse;
    }

        public void metodoSuperclasse() {
        System.out.println("Método da superclasse");
    }
}

class Subclasse extends Superclasse {
    private int valorSubclasse;

        public Subclasse(String valorSuperclasse, int valorSubclasse) {
        super(valorSuperclasse); // Chamando o construtor da superclasse
        this.valorSubclasse = valorSubclasse;
    }

        public int getValorSubclasse() {
        return valorSubclasse;
    }

        public void setValorSubclasse(int valorSubclasse) {
        this.valorSubclasse = valorSubclasse;
    }

    // Método da subclasse
    public void metodoSubclasse() {
        System.out.println("Método da subclasse");
    }
}
    }
}