package com.danilorocha;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped//torna a classe em um Singleton, assim o objeto só será criado quando for preciso, ou seja, inicialização preguiçosa
public class Config {
    @ConfigProperty(name="formatoRelatorios")
    private String formatoRelatorios = "pdf";

    @ConfigProperty(name="tipoGraficos")
    private String tipoGraficos = "barras";

    public String getFormatoRelatorios() {
        return formatoRelatorios;
    }

    public void setFormatoRelatorios(String formatoRelatorios) {
        this.formatoRelatorios = formatoRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }

}//classe
