
package psv;

import java.sql.*;
import java.util.*;


public class Teste {
    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        
        /*cb.setPlaca("BKE2013");
        cb.setCor ("PRETO");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));*/
        
       /* cb.setPlaca("BBB1900");
        cb.setCor ("AMARELO");
        cb.setDescricao("Carro 1");
        System.out.println(cd.alterar(cb));*/
        
      
      /* cb.setPlaca("BKE2013"); 
        System.out.println(cd.excluir(cb));*/
      
       
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
