
public class Tamagochi {
	
	/*Declaração das variáveis*/
    private String nome;
    private int idade;
    private double peso;
    private int comer;
    private int dormir;
    private int exercitar;
/*Classe construtura para meus objeto*/
    public Tamagochi(String nome,int idade,double peso,int comer,int dormir,int exercicitar){//INARA DA CUNHA VALENTIM
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.comer = comer;
        this.dormir = dormir;
        this.exercitar = exercitar;
    }
/*Acessando e retornando meus atributos declarados acima*/
    public String getNome(){//INARA DA CUNHA VALENTIM
        return this.nome;
    }
    public int getIdade(){//INARA DA CUNHA VALENTIM
        return this.idade;
    }
    public double getPeso(){//INARA DA CUNHA VALENTIM
        return this.peso;
    }
    public int getComer(){//INARA DA CUNHA VALENTIM
        return this.comer;
    }
    public int getDormir(){//INARA DA CUNHA VALENTIM
        return this.dormir;
    }
    public int getExercitar(){//INARA DA CUNHA VALENTIM
        return this.exercitar;
    }

}
