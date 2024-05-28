package daos;

import entitiesVO.Auto;

public interface IAutoDAO {
	   void insertar(Auto auto);
	    void borrar(int id);
	    void listar();
	    void editar(Auto auto);
}
