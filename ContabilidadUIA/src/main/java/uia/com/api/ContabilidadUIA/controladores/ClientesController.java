package uia.com.api.ContabilidadUIA.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uia.com.api.ContabilidadUIA.modelo.ClientesRepositorio;
import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;
import uia.com.api.ContabilidadUIA.modelo.gestor.Gestor;


@RestController
public class ClientesController {
	
	
	private ClientesRepositorio clientes = new ClientesRepositorio();
	
	
    @RequestMapping(value = "clientes/{clienteId}",method = RequestMethod.GET)
    public ResponseEntity <InfoUIA>clienteById(@PathVariable String clienteId)throws ClassNotFoundException
    {
        System.out.println("Saludos dese getAllClientes()");
        return ResponseEntity.ok((InfoUIA)clientes.getProveedor(clienteId));
    }
    
    
    
    @RequestMapping(value="clientes",method= RequestMethod.POST)
    public ResponseEntity<Object> agregaCliente(@RequestBody InfoUIA newCliente)
    {
    	System.out.println("Saludos desde agregarCliente()");
    	return ResponseEntity.ok((InfoUIA)clientes.agregaCatalogo(newCliente));
    }
    
    
   
    
    
    
  
   
    
    
    
    
    
}
