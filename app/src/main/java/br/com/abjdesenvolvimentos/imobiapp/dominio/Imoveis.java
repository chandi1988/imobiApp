package br.com.abjdesenvolvimentos.imobiapp.dominio;

import android.content.ContentValues;

public class Imoveis {
    private int id;
    private String descricao;
    private double preco;
    private String cidade;
    private int quartos;
    private int banheiros;
    private int comodos;
    private String tipo;
    private String status;
    private Corretora corretora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Corretora getCorretora() {
        return corretora;
    }

    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }

    public ContentValues getContentValues() {
        ContentValues cv = new ContentValues();

        cv.put("descricao", this.descricao);
        cv.put("preco", this.preco);
        cv.put("cidade", this.cidade);
        cv.put("quartos", this.quartos);
        cv.put("comodos", this.comodos);
        cv.put("banheiros", this.banheiros);
        cv.put("tipo", this.tipo);
        cv.put("status", this.status);
        cv.put("id_corretora", this.corretora.getId());

        return cv;
    }
}
