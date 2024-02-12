package com.webtools.assignment3_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import com.webtools.assignment3_8.Items;

/**
 *
 * @author amretasrerengarajan
 */
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private ArrayList<String> books;
    private ArrayList<String> laptops;
    private ArrayList<String> music;
    public ArrayList<String> items;
//    public Items things;
    public Item itemsInCart = new Item();

    public void init() {
        books = new ArrayList<String>();
        laptops = new ArrayList<String>();
        music = new ArrayList<String>();
        

        books.add("Java Servlet Programming [$29.95]");
        books.add("Oracle Database Programming [$48.95]");
        books.add("System Analysis and Design With UML [$14.95]");
        books.add("Object Oriented Software Engineering [$35.99]");
        books.add("Java Web Services [$27.99]");

        laptops.add("Apple MacBook Pro with 13.3' Display [$1299.99]");
        laptops.add("Asus Laptop with Centrno 2 Black [$949.95]");
        laptops.add("HP Pavlion Laptop with Centrino 2 DV7 [$1199.95]");
        laptops.add("Toshiba Satellite Laptop with Centrino 2- Copper [$899.99]");
        laptops.add("Sony VAIO Laptop with Core 2 DUO [$779.99]");

        music.add("I'm Going To Tell You A Secret by Madonna [$26.99]");
        music.add("Baby One More Time by Britney Spears [$10.95]");
        music.add("Justified by Justin Timberlake [$9.97]");
        music.add("Loose by Nelly Furtado [$13.98]");
        music.add("Gold Digger by Kanye West [$27.99]");
    }

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

        try {

            int bookSize = books.size();
            HttpSession session = request.getSession(true);
            items = new ArrayList<String>();

            String buttonClicked = request.getParameter("choice");
            String click = request.getParameter("check");

            if (buttonClicked == null) {
                buttonClicked = session.getAttribute("buttonClicked").toString();
            }

            if (buttonClicked.equalsIgnoreCase("Books")) {
                for (int i = 0; i < books.size(); i++) {
                    items.add(books.get(i));
                }

            } else if (buttonClicked.equalsIgnoreCase("Music")) {
                for (int i = 0; i < music.size(); i++) {
                    items.add(music.get(i));
                }

            } else if (buttonClicked.equalsIgnoreCase("Computer")) {
                for (int i = 0; i < laptops.size(); i++) {
                    items.add(laptops.get(i));
                }

            }

            if (click != null) {
                String y[]= request.getParameterValues("check");
                for (int i = 0; i < y.length; i++) {
                    itemsInCart.addItem(y[i]);
                }
            }
            

            session.setAttribute("visibleArray", items);
            session.setAttribute("buttonClicked", buttonClicked);
            session.setAttribute("cartArray", itemsInCart);
            System.out.print(buttonClicked);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("home");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException ex) {
                System.out.println(ex);
            }
        } catch (Exception ex) {

            System.out.println(ex);
        } finally {
            request.logout();

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
        HttpSession session = request.getSession(true);

        String re = request.getParameter("checkDel");

        Object cartArray = session.getAttribute("cartArray");

        if (cartArray.getClass().isArray()) {
            itemsInCart = (Item) Arrays.asList((Object[]) cartArray);
        }
        if(re != null) {
            String[] removeArray = request.getParameterValues("checkDel");
            for(int i = 0; i< removeArray.length; i++) {
                itemsInCart.removeItem(removeArray[i]);
            }
        }

        System.out.print(itemsInCart);
        session.setAttribute("cartArray", itemsInCart);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("cart");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException ex) {
            System.out.println(ex);
        }
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
