
package gametdif;

public class Item {
    private String nome, description;
    private int weight;
    private boolean visible, special;
    
    public Item(String name, int peso, String description, boolean visible, boolean special){
        this.nome = nome;
        this.weight = peso;
        this.description = description;
        this.visible = visible;
        this.special = special;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPeso() {
        return weight;
    }

    public void setPeso(int peso) {
        this.weight = peso;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
    
    
}
