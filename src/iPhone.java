public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    public static void main(String[] args) {

        @Override
        public void ligar () {
            System.out.println("Ligando...");
        }

        @Override
        public void atender () {
            System.out.println("Atendendo");
        }

        @Override
        public void iniciarCorreioDeVoz () {
            System.out.println("Iniciando correio de voz");
        }

        @Override
        public void tocar () {
            System.out.println("Tocando música");
        }

        @Override
        public void pausar () {
            System.out.println("Música pausada...");
        }

        @Override
        public void selecionarMusica () {
            System.out.println("Selecionando música...");
        }

        @Override
        public void exibirPagina () {
            System.out.println("Exibindo página...");
        }

        @Override
        public void adicionarNovaAba () {
            System.out.println("Adicionando nova aba...");
        }

        @Override
        public void atualizarPagina () {
            System.out.println("Atualizando página...");
        }
    }
}