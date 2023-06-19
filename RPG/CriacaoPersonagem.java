//
//package RPG;
//
//import java.util.Scanner;
//
//public class CriacaoPersonagem {
//
//    public static final String GUERREIRO = "guerreiro";
//    public static final String ARQUEIRO = "arqueiro";
//    public static final String MAGO = "mago";
//    public static final String ASSASSINO = "assassino";
//    public static final String BARDO = "bardo";
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bem-vindo ao criador de personagens de RPG!");
//
//        // Pedindo a quantidade de personagens a serem criados
//        System.out.print("Digite a quantidade de personagens a serem criados: ");
//        int quantidade = scanner.nextInt();
//
//        // Criando um array de objetos para armazenar os personagens
//        Personagem[] personagens = new Personagem[quantidade];
//
//        // Loop para criar cada personagem
//        for (int i = 0; i < quantidade; i++) {
//            scanner.nextLine(); // Limpa o buffer do scanner
//
//            // Pedindo o nome do personagem
//            System.out.print("Digite o nome do personagem " + (i + 1) + ": ");
//            String nome = scanner.nextLine();
//
//            // Pedindo a classe do personagem
//            String classe;
//            do {
//                System.out.print("Digite a classe do personagem " + (i + 1) + "(" + GUERREIRO + ", " + ARQUEIRO + ", " + MAGO + ", " + ASSASSINO + " ou " + BARDO + "):");
//                classe = scanner.nextLine();
//            } while (!classeValida(classe)); // Loop até que o usuário digite uma classe válida
//
//            // Pedindo os atributos do personagem
//            System.out.print("Digite a quantidade de vida do personagem " + (i + 1) + ": ");
//            int vida = scanner.nextInt();
//
//            System.out.print("Digite a quantidade de defesa do personagem " + (i + 1) + ": ");
//            int mana = scanner.nextInt();
//
//            System.out.print("Digite a quantidade de dano que o personagem " + (i + 1) + " causa: ");
//            int dano = scanner.nextInt();
//
//            // Criando o objeto Personagem e armazenando no array
//            switch (classe) {
//                case GUERREIRO:
//                    personagens[i] = new Guerreiro(nome, vida, mana, dano);
//                    break;
//                case ARQUEIRO:
//                    personagens[i] = new Arqueiro(nome, vida, mana, dano);
//                    break;
//                case MAGO:
//                    personagens[i] = new Mago(nome, vida, mana, dano);
//                    break;
//                case ASSASSINO:
//                    personagens[i] = new Assassino(nome, vida, mana, dano);
//                    break;
//                case BARDO:
//                    personagens[i] = new Bardo(nome, vida, mana, dano);
//                    break;
//                default:
//                    System.out.println("Classe inválida!");
//                    break;
//            }
//        }
//
//        // Exibindo os personagens criados
//        System.out.println("\nPersonagens criados:");
//        for (Personagem personagem : personagens) {
//            System.out.println(personagem.toString());
//        }
//
//        scanner.close();
//    }
//
//// Método para validar se a classe digitada pelo usuário é válida
//    private static boolean classeValida(String classe) {
//        return classe.equals(GUERREIRO) || classe.equals(ARQUEIRO) || classe.equals(MAGO) || classe.equals(ASSASSINO) || classe.equals(BARDO);
//    }
//    } 
