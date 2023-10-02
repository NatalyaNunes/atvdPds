/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifrn.pds.pratica.persistencia;

import br.edu.ifrn.pds.pratica.negocio.dominio.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 20201114010053
 */
public class FilmeDAO {
     public boolean inserirFilme(Filme filme) {

        boolean resultado = false;
        String query = "INSERT INTO filme(titulo, duracao, ano, avaliacao) VALUES(?,?,?,?);";

        Connection conexao = Conexao.conectar();

        try {

            PreparedStatement comando = conexao.prepareStatement(query);

            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getDuracao());
            comando.setInt(3, filme.getAno());
            comando.setDouble(4, filme.getAvaliacao());

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                resultado = true;
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            Conexao.desconectar();
        }
        return resultado;
    }
    public boolean alterarFilme(Filme filme) {

        boolean resultado = false;
        String query = "UPDATE filme set titulo = ?, duracao = ?, ano = ?, avaliacao = ? where id = ?;";

        Connection conexao = Conexao.conectar();

        try {

            PreparedStatement comando = conexao.prepareStatement(query);

            comando.setString(1, filme.getTitulo());
            comando.setInt(2, filme.getDuracao());
            comando.setInt(3, filme.getAno());
            comando.setDouble(4, filme.getAvaliacao());
            comando.setInt(5, filme.getId());

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                resultado = true;
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            Conexao.desconectar();
        }
        return resultado;
    }
    public boolean removerFilme(String titulo) {
        boolean resultado = false;
        String query = "DELETE from filme where titulo = ?;";

        Connection conexao = Conexao.conectar();

        try {

            PreparedStatement comando = conexao.prepareStatement(query);

            comando.setInt(1, titulo);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                resultado = true;
            }
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            Conexao.desconectar();
        }
        return resultado;
    }
     public Filme buscarFilme(String titulo) {

        Filme f1 = null;

        String query = "SELECT titulo, duracao, ano, avaliacao from filme where titulo = ?;";

        Connection conexao = Conexao.conectar();

        try {

            PreparedStatement comando = conexao.prepareStatement(query);

            comando.setString(1, titulo);

            ResultSet resultSet = comando.executeQuery();

            if (resultSet.next()) {

                f1 = new Filme();                
                f1.setTitulo(resultSet.getString("titulo"));
                f1.setDuracao(resultSet.getInt("duracao"));
                f1.setAno(resultSet.getInt("ano"));
                f1.setAvaliacao(resultSet.getDouble("Avaliacao"));
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        } finally {
            Conexao.desconectar();
        }

        return f1;
    }
}
