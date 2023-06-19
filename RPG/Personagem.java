
package RPG;

public abstract class Personagem {

 protected String nome;
 protected int vida;
 protected int mana;
 protected int dano;

  public Personagem (String nome, int vida, int mana, int dano) {
    this.nome = nome;
    this.vida = vida;
    this.mana = mana;
    this.dano = dano;
}
}
