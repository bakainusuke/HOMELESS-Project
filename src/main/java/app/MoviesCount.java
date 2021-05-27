package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class MoviesCount  implements Handler  {
    public static final String URL = "/moviescount.html";
    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Movies</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html = html + "<body>";

        // Add HTML for the movies list
        html = html + "<h1>Movies by Directors</h1>";

        /* Add HTML for the web form
         * We are giving two ways here
         *  - one for a text box
         *  - one for a drop down
         * 
         * Whitespace is used to help us understand the HTML!
         * 
         * IMPORTANT! the action speicifes the URL for POST!
         */
        html = html + "<form action='/moviescount.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='movietype_drop'>Select the type Movie Directors (Dropdown):</label>";
        html = html + "      <select id='movietype_drop' name='movietype_drop'>";
        html = html + "         <option>Allen, Woody</option>";
        html = html + "         <option>Hitchcock, Alfred</option>";
        html = html + "         <option>De Mille, Cecil B</option>";
        html = html + "         <option>Kramer, Stanley</option>";
        html = html + "         <option>Kubrick, Stanley</option>";
        html = html + "         <option>Preminger, Otto</option>";
        html = html + "         <option>Ford, John</option>";
        html = html + "         <option>Fellini, Federico</option>";
        html = html + "      </select>";
        html = html + "   </div>";
       
        html = html + "   <button type='submit' class='btn btn-primary'>GO GO</button>";
        html = html + "</form>";

        /* Get the Form Data
         *  from the drop down list
         * Need to be Careful!!
         *  If the form is not filled in, then the form will return null!
        */
        String movietype_drop = context.formParam("movietype_drop");
        if (movietype_drop == null) {
            // If NULL, nothing to show, therefore we make some "no results" HTML
            html = html + "<h2><i>No Results to show for dropbox</i></h2>";
        } else {
            // If NOT NULL, then lookup the movie by type!
            html = html + outputMovies(movietype_drop);
        }

       

        // Add HTML for link back to the homepage
        html = html + "<p>Return to Homepage: ";
        html = html + "<a href='/'>Link to Homepage</a>";
        html = html + "</p>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

    public String outputMovies(String type) {
        String html = "";
        html = html + "<h2>" + type + "'s Movies</h2>";

        // Look up movies from JDBC
        JDBCConnection jdbc = new JDBCConnection();
        ArrayList<String> movies = jdbc.getMoviesByDirector(type);
        
        // Add HTML for the movies list
        html = html + "<ul>";
        for (String movie : movies) {
            html = html + "<li>" + movie + "</li>";
        }
        html = html + "</ul>";

        return html;
    }
}
