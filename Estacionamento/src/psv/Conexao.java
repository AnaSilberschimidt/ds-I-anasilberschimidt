/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;


import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções



public class Conexao {
    public static Connection abrirConexao() {
        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";
            con = (Connection) DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
