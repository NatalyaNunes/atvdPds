/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifrn.pds.pratica.ui;

import br.edu.ifrn.pds.pratica.negocio.dominio.Filme;
import br.edu.ifrn.pds.pratica.persistencia.FilmeDAO;

/**
 *
 * @author 20201114010053
 */
public class Aplicacao {
    public static void main (String[] args){
        Filme f1 = new Filme(1, "Barbie", 2, 2020, 4.5);
        FilmeDAO f = new FilmeDAO();
        //f.inserirFilme(f1);
        
        //f.alterarFilme(f1);
        
        //f.removerFilme(2);
        
        f.buscarFilme("Barbie");
    }
}
