package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Temporary HTML as an example page.
 * 
 * Based on the Project Workshop code examples.
 * This page currently:
 *  - Provides a link back to the index page
 *  - Displays the list of movies from the Movies Database using the JDBCConnection
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Page1 implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/page1.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Movies</title>";
         // Add some CSS (external file)
        html = html + "<link href='https://fonts.googleapis.com/css?family=Oswald&display=swap' rel='stylesheet' />";
        html = html + "<link href='https://fonts.googleapis.com/css?family=Lato&display=swap' rel='stylesheet' />";
        html = html + "<link href='https://fonts.googleapis.com/css?family=NTR&display=swap' rel='stylesheet' />";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html = html + "<body>";

        // Add HTML for link back to the homepage
        

        // Look up some information from JDBC
        // First we need to use your JDBCConnection class
        

        // Add HTML for the movies list
        html = html  + "<ul style='text-align:centre'>";

        html = html + "<div class='v1_1'>";
        html = html +    "<div class='v1_2'>";
        html = html +    "</div>";
        html = html + "<div class='v7_73'>";
            
        html = html + "<span class='v7_78'>CONTACT US</span>";
        html = html +   "<span class='v7_79'>DATABANK</span>";
        html = html +    "<span ><a class='v7_80' href='/'>HOME FOR US</a></span>";
        html = html +    "<span class='v7_77'>OUR FOCUS</span>";

        html = html + "</div>";




        html = html + "<h1 style='text-align:centre'>Glance Into Homeless Data 2016 & 2018</h1>";
        

       
        //input 
        html = html + "<form action='/page1.html' method='post'>";
        html = html + "   <div class='form-group'>";
        // year dropbox
        html = html + "      <label for='year'>YEAR: </label>";
        html = html + "      <select id='year' name='year'>";
        html = html + "         <option>2016</option>";
        html = html + "         <option>2018</option>";
        html = html + "      </select>";
        // gender dropbox
        html = html + "      <label for='gender'>   GENDER:</label>";
        html = html + "      <select id='gender' name='gender'>";
        html = html + "         <option>Both</option>";
        html = html + "         <option>Male</option>";
        html = html + "         <option>Female</option>";
        html = html + "      </select>";
        //age1 dropbox
        html = html + "      <label for='age1'>   AGE FROM </label>";
        html = html + "      <select id='age1' name='age1'>";
        html = html + "         <option>0-9</option>";
        html = html + "         <option>10-19</option>";
        html = html + "         <option>20-29</option>";
        html = html + "         <option>30-39</option>";
        html = html + "         <option>40-49</option>";
        html = html + "         <option>50-59</option>";
        html = html + "         <option>60+</option>";
        html = html + "      </select>";
        //age2 dropbox
        html = html + "      <label for='age2'> TO </label>";
        html = html + "      <select id='age2' name='age2'>";
        html = html + "         <option>0-9</option>";
        html = html + "         <option>10-19</option>";
        html = html + "         <option>20-29</option>";
        html = html + "         <option>30-39</option>";
        html = html + "         <option>40-49</option>";
        html = html + "         <option>50-59</option>";
        html = html + "         <option>60+</option>";
        html = html + "      </select>";
        //State dropbox
        html = html + "      <label for='state'>   STATE:</label>";
        html = html + "      <select id='state' name='state'>";
        html = html + "         <option>All</option>";
        html = html + "         <option>NSW</option>";
        html = html + "         <option>VIC</option>";
        html = html + "         <option>QLD</option>";
        html = html + "         <option>SA</option>";
        html = html + "         <option>WA</option>";
        html = html + "         <option>TAS</option>";
        html = html + "         <option>NT</option>";
        html = html + "         <option>ACT</option>";
        html = html + "         <option>OTHER</option>";
        html = html + "      </select>";
        //Sort dropbox
        html = html + "      <label for='sort'>   SORT BY:</label>";
        html = html + "      <select id='sort' name='sort'>";
        html = html + "         <option>High to Low</option>";
        html = html + "         <option>Low to High</option>";
        html = html + "      </select>";
        //submit
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>SEARCH</button>";
        html = html + "</form>";
        

        // config drop list
        String year = context.formParam("year");
        String gender = context.formParam("gender");
        String age1 = context.formParam("age1");
        String age2 = context.formParam("age2");
        String sort = context.formParam("sort");
        String state = context.formParam("state");
        
        if (gender.equals("Both")) {
            gender = "%";
        } else if (gender.equals("Male")) {
            gender = "m";
        } else if (gender.equals("Female")) {
            gender = "f";
        }

        
        if (age1.equals("0-9")) {
            age1 = "9";
        } else if (age1.equals("10-19")) {
            age1 = "19";
        } else if (age1.equals("20-29")) {
            age1 = "29";
        } else if (age1.equals("30-39")) {
            age1 = "39";
        } else if (age1.equals("40-49")) {
            age1 = "49";
        } else if (age1.equals("50-59")) {
            age1 = "59";
        } else if (age1.equals("60+")) {
            age1 = "60";
        }

       
        if (age2.equals("0-9")) {
            age2 = "9";
        } else if (age2.equals("10-19")) {
            age2 = "19";
        } else if (age2.equals("20-29")) {
            age2 = "29";
        } else if (age2.equals("30-39")) {
            age2 = "39";
        } else if (age2.equals("40-49")) {
            age2 = "49";
        } else if (age2.equals("50-59")) {
            age2 = "59";
        } else if (age2.equals("60+")) {
            age2 = "60";
        }

        
       
        if (sort.equals("High to Low")) {
            sort = "DESC";
        } else if (sort.equals("Low to High")) {
            sort = "ASC";
        }
        
        

        
        if (state.equals("All")) {
            html = html + outputState(year,gender,age1,age2,state,sort);
        } else {
            html = html + outputLGA(year,gender,age1,age2,state,sort);
        }
        



        html = html + "<div>";
        html = html +   "<span class='v1_3'>PHONE</span>";
        html = html + "<span class='v1_4'>(03) XXXX XXX</span>";
        html = html + "<span class='v1_5'>Contact </span>";
        html = html + "<span class='v1_6'>Feel free to contact us with any questions.</span>";
        html = html + "<span class='v1_7'>Email</span>";
        html = html + "<span class='v1_8'>email@example.com</span>";
        html = html + "</div>";

        html = html + "<div>";
        html = html + "<span class='v1_9'>CONTACT US</span>";
        html = html + "<span class='v1_10'>HOME FOR US</span>";
        html = html + "<span class='v1_11'>OUR FOCUS</span>";
        html = html + "<span class='v1_12'>A PROJECT OF RMIT STUDENTS</span>";
        html = html + "<span class='v1_13'>FIND OUT MORE</span>";
        html = html + "<span class='v1_14'>DATABANK</span>";
        html = html + "<span class='v1_15'>HOME</span>";
        html = html + "<span class='v1_16'>CONTACT US</span>";
        html = html + "</div>";

    html = html + "</div>";




        // Finally we can print out all of the movies
        

        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }
    public String outputState(String year,String gender,String age1,String age2,String state,String sort) {
        String html = "";
        JDBCConnection jdbc = new JDBCConnection();
        ArrayList<String> statedata = jdbc.getStatState(year,gender,age1,age2,state,sort);

        html = html + "<ul>";

        for (String data : statedata) {
            html = html + "<li>" + data + "</li>";
        }
        html = html + "</ul>";

        return html;
    }
    public String outputLGA(String year,String gender,String age1,String age2,String state,String sort) {
        String html = "";
        JDBCConnection jdbc = new JDBCConnection();
        ArrayList<String> lgadata = jdbc.getStatLGA(year,gender,age1,age2,state,sort);

        html = html + "<ul>";

        for (String data : lgadata) {
            html = html + "<li>" + data + "</li>";
        }
        html = html + "</ul>";

        return html;
    }

}
