package univs.edu.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Akari
 */

public class UsuarioTableModel extends AbstractTableModel {

    private List<UsuarioAjudado> usuarios = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "CPF","Login", "Senha", "motivo"};

    public UsuarioTableModel(List<UsuarioAjudado> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UsuarioAjudado usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getIdUsuario();
            case 1:
                return usuario.getNomeUsuario();
            case 2: 
                return usuario.getCpf();
            case 3: 
                return usuario.getLogin();
            case 4:
                return usuario.getSenha();
                case 5:
                return usuario.getProblema();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
                case 5:
                return colunas[5];
        }
        return null;
    }

}
