package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O Problema dos 3 porcos", 36);

        /*int a = 5;
        int b = 3 ;
        System.out.println("hello " + (a+b));*/
    }


}

class Livro {
    private String name;
    private Integer numPages;

    public Livro(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }
}
