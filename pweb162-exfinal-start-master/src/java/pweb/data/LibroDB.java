package pweb.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pweb.business.Libro;

public class LibroDB {         
    
    public static Libro selectLibro(String codigo)
    {
    }
    

    public static ArrayList<Libro> selectLibros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
