package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;
import java.util.List;

import uia.com.api.ContabilidadUIA.modelo.gestor.Gestor;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;
import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.gestor.DecoradorProveedores;


public class ClientesRepositorio {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public Proveedor proveedor = null;
		public ArrayList<InfoUIA> listaProveedores = null;
		
		

		


		public String clienteId="";

	


		public ClientesRepositorio()
		{
		 contabilidad = new Gestor("C:\\Users\\jonat\\Downloads\\ContabilidadUIA (1)\\ContabilidadUIA\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		}
		

		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}

		
		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}
		
		public Proveedor getProveedor() {
			return proveedor;
		}

		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}
		
		public InfoUIA agregaCatalogo (InfoUIA newCliente) 
		{
		return gestorProveedores.agregaCatalogo(newCliente);	
			
		}
		
		public Object getProveedor(String clienteId) 
	    
	    {
	    	proveedor = (Proveedor) contabilidad.busca(clienteId);
			return proveedor;
	    	
	    }
	    


		public String getClienteId() {
			return clienteId;
		}


		public void setClienteId(String clienteId) {
			this.clienteId = clienteId;
		}
		
		

		public List<InfoUIA> getListaProveedores() {
			listaProveedores = gestorProveedores.getLista();
			return null;
		}
		
		public Gestor getContabilidad() {
			return contabilidad;
		}
		
		public void setContabilidad() 
		{
			this.contabilidad=contabilidad;
		}
		


		
	
}
