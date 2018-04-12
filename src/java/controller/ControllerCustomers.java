/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Customers;
import model.Product;
import model.Products;
import model.Role;

/**
 *
 * @author Nizis
 */
public class ControllerCustomers extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPass");

        /* TODO output your page here. You may use following sample code. */
        try {

            String action = request.getParameter("action");
            if (action.equals("Search")) {
                String tenUN = request.getParameter("txtsearch");
                Customer a = new Customer();
                List<Customers> list = new ArrayList<Customers>();
                list = a.showCus(tenUN);
                request.setAttribute("listUN", list);
                RequestDispatcher rq = request.getRequestDispatcher("customers.jsp");
                rq.forward(request, response);
            } else if (action.equals("Log in")) {
                Role a = new Role();

                Customer ab = new Customer();
                
                boolean exits = false;
                exits= ab.checkLogin(user, pass);
                String url = "error.jsp";
                if (exits) {
                    if (a.getAdmin().equals("0")) {
                        url = "welcome.jsp";
                        HttpSession session = request.getSession(true);
                        session.setAttribute("USER", user);
                        RequestDispatcher rq = request.getRequestDispatcher(url);
                        rq.forward(request, response);
                    }
                    if (a.getAdmin().equals("1")) {
                        url = "products.jsp";
                        HttpSession session = request.getSession(true);
                        session.setAttribute("USER", user);
                        RequestDispatcher rq = request.getRequestDispatcher(url);
                        rq.forward(request, response);
                    }
                }
                RequestDispatcher rq = request.getRequestDispatcher(url);
                rq.forward(request, response);
            } else if (action.equals("Delete")) {
                String code = request.getParameter("txtUNA");
                Customer a = new Customer();
                a.delete(code);
                String url = "ControllerCustomers?action=Search&txtsearch=";
                RequestDispatcher rq = request.getRequestDispatcher(url);
                rq.forward(request, response);
            } else if (action.equals("New")) {
                String url = "newCustomers.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } else if (action.equals("Edit")) {

                String url = "error_1.jsp";
                RequestDispatcher rq = request.getRequestDispatcher(url);
                rq.forward(request, response);

            } else if (action.equals("Register")) {
                String un = request.getParameter("txtUN");
                String PW = request.getParameter("txtPW");
                String HVT = request.getParameter("txtHVT");
                String email = request.getParameter("txtEmail");
                String checkadmin = request.getParameter("checkadmin");
                boolean roles = true;
                if (checkadmin != null) {
                    roles = false;
                }
                Customer a = new Customer();
                boolean result = a.insert(un, PW, HVT, email, roles);
                RequestDispatcher rq = request.getRequestDispatcher("login.jsp");
                rq.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
