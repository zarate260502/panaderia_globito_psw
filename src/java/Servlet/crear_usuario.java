package Servlet;

import Controlador.MUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class crear_usuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
            String nom = request.getParameter("nombre");
            String app= request.getParameter("appellido");
            String nusu = request.getParameter("nickname");
            String pass= request.getParameter("contra");
        
            MUsuario usu = new MUsuario();
            usu.setNom_usu(nom);
            usu.setAppat_usu(app);
            usu.setUser_usu(nusu);
            usu.setPass_usu(pass);
            System.out.println(usu);
            
        } catch (Exception e) {
                System.out.println("error: "+e.getMessage());
        }
        
        
        
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
