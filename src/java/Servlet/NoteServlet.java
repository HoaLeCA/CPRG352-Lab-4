
package Servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Note;

public class NoteServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // check whenever which JSP wil display 
        String check = request.getParameter("edit");
        // read text file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note;
        try ( // to read a file
                BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String title = br.readLine();
            String content = br.readLine();
            note = new Note(title, content);
        }
           
        //request.setAttribute("note", note);
        request.setAttribute("note", note);
        
        if(check == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        return;
      
       }
    }      
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        Note note;
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            String title = request.getParameter("getTitle");
            String contents = request.getParameter("getContent");
            note = new Note(title,contents);
            pw.write(note.getTitle()+"\n");
            pw.write(note.getContent());
            pw.flush();
        }
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }
             
     
}
