
package br.com.simoes.dukemarket.app;

import br.com.simoes.dukemarket.bean.Produto;
import br.com.simoes.dukemarket.dao.ProdutosDAO;
import connection.MySQLConnection;

/**
 *
 * @author Aluno
 */
public class DukeMarketApp {
    public static void main(String[] args) {
        MySQLConnection.getConnection();
        
        Produto pAux;
        ProdutosDAO pDAO = new ProdutosDAO(); 
        
        // teste de inclusao de produto 
        
//        
    //teste de exclusao do produto
        pAux = new Produto();
        pAux.setCodBarras("11111111");
        pAux.setDescricao("Mouse Logitec Wirelles");
        pAux.setQtd(60);
        pAux.setValorCompra(80.00);
        pAux.setValorVenda(800.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto();
        pAux.setCodBarras("22222222");
        pAux.setDescricao("Teclado Gamer Razer Huntsman");
        pAux.setQtd(100);
        pAux.setValorCompra(250.00);
        pAux.setValorVenda(1000.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto();
        pAux.setCodBarras("33333333");
        pAux.setDescricao("Mon Gamer AOC 24.5 LED Full");
        pAux.setQtd(100);
        pAux.setValorCompra(300.00);
        pAux.setValorVenda(1200.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto();
        pAux.setCodBarras("121215454");
        pAux.setDescricao("Processador Ryzen 7.1");
        pAux.setQtd(200);
        pAux.setValorCompra(400.00);
        pAux.setValorVenda(1500.00);
        
        pDAO.create(pAux);
        
        pAux = new Produto();
        pAux.setCodBarras("121513214");
        pAux.setDescricao("Cadeira Gamer ThunderX3");
        pAux.setQtd(100);
        pAux.setValorCompra(500.00);
        pAux.setValorVenda(2500.00);
        
        pDAO.create(pAux);
        
        //lista geral 
        
        pDAO.getResults().forEach( p -> {
            System.out.println(p.toString()); 
        });
//    
//    pDAO.delete(1);
//////    lista geral
//    pDAO.getResults().forEach(p ->{
//        System.out.println(p.toString());
//    });
//    }
    
//    pAux = pDAO.getResultById(8);
//    pAux.setQtd(100);
//    pDAO.update(pAux);
//    
//    //lista geral
//    pDAO.getResults().forEach( p-> {
//        System.out.println(p.toString());
//    });
    
}
}
                