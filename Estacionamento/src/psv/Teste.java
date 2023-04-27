
package psv;

import java.sql.*;
import java.util.*;


public class Teste {
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        /*cb.setPlaca("JKL2897");
        cb.setCor ("Verde");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));
        */
      
       /* cb.setPlaca("JSD2555"); 
        System.out.println(cd.excluir(cb));
       */
       
       List<CarroBean> lista = cd.listarTodos();
       
            if(lista != null){
                for (CarroBean carro : lista){
                    System.out.println("Placa: "+ carro.getPlaca());
                    System.out.println("Cor: "+ carro.getCor());
                    System.out.println("Descrição: "+ carro.getDescricao());
                    
                }
            }
        
    }
 
}